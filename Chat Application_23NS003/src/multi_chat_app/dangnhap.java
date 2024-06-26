package multi_chat_app;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;

public class dangnhap extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField texTK;
    private JTextField texMK;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    dangnhap frame = new dangnhap();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public dangnhap() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton = new JButton("Đăng Nhập");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy thông tin tài khoản và mật khẩu từ các trường nhập liệu
                String username = texTK.getText();
                String password = texMK.getText();
                
                // Kiểm tra thông tin đăng nhập
                    // Nếu thông tin đăng nhập đúng, mở trang client
                    client clientPage = new client();
                    clientPage.setVisible(true);
                    // Ẩn trang đăng nhập
                    setVisible(false);
            }
        });
        
        btnNewButton.setBounds(88, 189, 123, 34);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Thoát");
        btnNewButton_1.setBounds(231, 190, 123, 32);
        contentPane.add(btnNewButton_1);
        
        texTK = new JTextField();
        texTK.setBounds(162, 95, 192, 19);
        contentPane.add(texTK);
        texTK.setColumns(10);
        
        texMK = new JTextField();
        texMK.setBounds(162, 139, 192, 19);
        contentPane.add(texMK);
        texMK.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Tên");
        lblNewLabel.setBounds(110, 93, 34, 22);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Mật khẩu");
        lblNewLabel_1.setBounds(88, 136, 56, 25);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(null);
        lblNewLabel_2.setBounds(182, 30, 45, 55);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Đăng Nhập");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lblNewLabel_3.setBounds(129, 30, 250, 55);
        contentPane.add(lblNewLabel_3);
        
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
