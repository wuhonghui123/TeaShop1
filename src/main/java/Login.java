import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Apr 02 09:36:02 CST 2022
 */


/**
 * @author unknown
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        textField1 = new JTextField("guet");
        label1 = new JLabel();
        label2 = new JLabel();
        textField2 = new JTextField("guet1234");
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(textField1);
        textField1.setBounds(180, 55, 95, textField1.getPreferredSize().height);

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d\uff1a");//用户名：
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(110, 60), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u5bc6\u7801\uff1a");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(110, 95), label2.getPreferredSize()));
        contentPane.add(textField2);
        textField2.setBounds(180, 95, 95, textField2.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addActionListener(
                (e) -> {
                    /*
                    实现登录
                    1、先拿到登录界面的用户名和密码
                    2、去数据库比对用户名和密码
                    就是去执行一条SQL语句，但是是什么样的SQL语句呢？
                     */
                    String username = textField1.getText();
                    String password = textField2.getText();

                    String sql = "SELECT * FROM sys_user WHERE name='" + username + "' AND password='" + password + "'";
                    System.out.println(sql);

                    /*
                    1、连接数据库（添加mysql的maven依赖）
                    2、执行SQL语句，验证用户名和密码
                     */
                    Connection conn = null;
                    String user = "root";
                    String dbPassword = "123456";
                    String url = "jdbc:mysql://120.25.164.209:3306/teashop";

                    Statement statement = null;//语句对象
                    ResultSet rs = null;//结果集：游标（虚拟的指针）

                    try {
                        conn = DriverManager.getConnection(url, user, dbPassword);
                        System.out.println(conn);

                        statement = conn.createStatement();
                        rs = statement.executeQuery(sql);//刚刚执行完查询的时候，游标不指向任何记录

                        // 如何判断用户名和密码是否正确？
                        if (rs.next()) {
                            System.out.println("登录成功");
                        } else {
                            System.out.println("用户名或密码错误");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
        );
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(160, 175), button1.getPreferredSize()));

        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField textField1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField2;
    private JButton button1;

    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new Login();
    }
}
