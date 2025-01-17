import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DetailsPage extends JFrame implements ActionListener, MouseListener {
    JButton register;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JRadioButton rb1;
    JRadioButton rb2;
    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;
    JCheckBox checkBox4;
    JCheckBox checkBox5;
    JCheckBox checkBox6;
    static ArrayList<String> list = new ArrayList<>();

    DetailsPage() {

        ImageIcon image1 = new ImageIcon("Vlogo.png");

        JLabel label1 = new JLabel("Name");
        label1.setFont(new Font("Times Roman", Font.BOLD, 20));
        label1.setBounds(50, 50, 450, 50);
        label1.setForeground(Color.pink);

        JLabel label2 = new JLabel("Course");
        label2.setFont(new Font("Times Roman", Font.BOLD, 20));
        label2.setBounds(50, 150, 450, 50);
        label2.setForeground(Color.pink);

        JLabel label3 = new JLabel("Year");
        label3.setFont(new Font("Times Roman", Font.BOLD, 20));
        label3.setBounds(50, 250, 450, 50);
        label3.setForeground(Color.pink);

        JLabel label4 = new JLabel("Roll No.");
        label4.setFont(new Font("Times Roman", Font.BOLD, 20));
        label4.setBounds(50, 350, 450, 50);
        label4.setForeground(Color.pink);

        JLabel label5 = new JLabel("Mode of Payment");
        label5.setFont(new Font("Times Roman", Font.BOLD, 20));
        label5.setBounds(50, 450, 450, 50);
        label5.setForeground(Color.pink);

        JLabel label6 = new JLabel("Participating in Cultural Events");
        label6.setFont(new Font("Times Roman", Font.BOLD, 20));
        label6.setBounds(50, 50, 450, 50);
        label6.setForeground(Color.pink);

        JLabel label7 = new JLabel("Participating in sports");
        label7.setFont(new Font("Times Roman", Font.BOLD, 20));
        label7.setBounds(50, 215, 450, 50);
        label7.setForeground(Color.pink);

        textField1 = new JTextField(350);
        textField1.setBounds(50, 100, 350, 25);
        textField1.setCaretColor(Color.white);
        textField1.setBackground(Color.decode("#626262"));
        textField1.setFont(new Font("Times Roman", Font.BOLD, 20));
        textField1.setForeground(Color.white);
        Border b1 = BorderFactory.createLineBorder(Color.decode("#232323"));
        textField1.setBorder(b1);
        textField1.addMouseListener(this);

        textField2 = new JTextField(350);
        textField2.setBounds(50, 200, 350, 25);
        textField2.setCaretColor(Color.white);
        textField2.setBackground(Color.decode("#626262"));
        textField2.setFont(new Font("Times Roman", Font.BOLD, 20));
        textField2.setForeground(Color.white);
        Border b2 = BorderFactory.createLineBorder(Color.decode("#232323"));
        textField2.setBorder(b2);
        textField2.addMouseListener(this);

        textField3 = new JTextField(350);
        textField3.setBounds(50, 300, 350, 25);
        textField3.setCaretColor(Color.white);
        textField3.setBackground(Color.decode("#626262"));
        textField3.setFont(new Font("Times Roman", Font.BOLD, 20));
        textField3.setForeground(Color.white);
        Border b3 = BorderFactory.createLineBorder(Color.decode("#232323"));
        textField3.setBorder(b3);
        textField3.addMouseListener(this);

        textField4 = new JTextField(350);
        textField4.setBounds(50, 400, 350, 25);
        textField4.setCaretColor(Color.white);
        textField4.setBackground(Color.decode("#626262"));
        textField4.setFont(new Font("Times Roman", Font.BOLD, 20));
        textField4.setForeground(Color.white);
        Border b4 = BorderFactory.createLineBorder(Color.decode("#232323"));
        textField4.setBorder(b4);
        textField4.addMouseListener(this);

        rb1 = new JRadioButton("Online");
        rb2 = new JRadioButton("Cash");
        rb1.setBounds(50, 500, 100, 25);
        rb2.setBounds(150, 500, 100, 25);
        rb1.setFont(new Font("Times Roman", Font.BOLD, 20));
        rb2.setFont(new Font("Times Roman", Font.BOLD, 20));
        rb1.setBackground(Color.black);
        rb2.setBackground(Color.black);
        rb1.setFocusable(false);
        rb2.setFocusable(false);
        rb1.setForeground(Color.decode("#DDD6E1"));
        rb2.setForeground(Color.decode("#DDD6E1"));
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);

        checkBox1 = new JCheckBox("Music");
        checkBox2 = new JCheckBox("Dance");
        checkBox3 = new JCheckBox("Other");
        checkBox1.setBounds(50, 100, 450, 30);
        checkBox2.setBounds(50, 130, 450, 30);
        checkBox3.setBounds(50, 160, 450, 30);
        checkBox1.setBackground(Color.black);
        checkBox2.setBackground(Color.black);
        checkBox3.setBackground(Color.black);
        checkBox1.setFont(new Font("Times Roman", Font.BOLD, 20));
        checkBox2.setFont(new Font("Times Roman", Font.BOLD, 20));
        checkBox3.setFont(new Font("Times Roman", Font.BOLD, 20));
        checkBox1.setFocusable(false);
        checkBox2.setFocusable(false);
        checkBox3.setFocusable(false);
        checkBox1.setForeground(Color.decode("#DDD6E1"));
        checkBox2.setForeground(Color.decode("#DDD6E1"));
        checkBox3.setForeground(Color.decode("#DDD6E1"));

        checkBox4 = new JCheckBox("Cricket");
        checkBox5 = new JCheckBox("Volleyball");
        checkBox6 = new JCheckBox("Badminton");
        checkBox4.setBounds(50, 265, 450, 25);
        checkBox5.setBounds(50, 290, 450, 25);
        checkBox6.setBounds(50, 315, 450, 25);
        checkBox4.setBackground(Color.black);
        checkBox5.setBackground(Color.black);
        checkBox6.setBackground(Color.black);
        checkBox4.setFont(new Font("Times Roman", Font.BOLD, 20));
        checkBox5.setFont(new Font("Times Roman", Font.BOLD, 20));
        checkBox6.setFont(new Font("Times Roman", Font.BOLD, 20));
        checkBox4.setFocusable(false);
        checkBox5.setFocusable(false);
        checkBox6.setFocusable(false);
        checkBox4.setForeground(Color.decode("#DDD6E1"));
        checkBox5.setForeground(Color.decode("#DDD6E1"));
        checkBox6.setForeground(Color.decode("#DDD6E1"));

        register = new JButton("Register");
        register.setFont(new Font("Times Roman", Font.BOLD, 20));
        register.setBounds(470, 50, 200, 50);
        register.setBackground(Color.pink);
        register.setForeground(Color.white);
        register.setFocusable(false);
        register.addActionListener(this);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 600, 700);
        panel1.setBackground(Color.black);
        panel1.setLayout(null);
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        panel1.add(label3);
        panel1.add(textField3);
        panel1.add(label4);
        panel1.add(textField4);
        panel1.add(label5);
        panel1.add(rb1);
        panel1.add(rb2);

        JPanel panel2 = new JPanel();
        panel2.setBounds(600, 0, 600, 600);
        panel2.setBackground(Color.black);
        panel2.setLayout(null);
        panel2.add(label6);
        panel2.add(checkBox1);
        panel2.add(checkBox2);
        panel2.add(checkBox3);
        panel2.add(label7);
        panel2.add(checkBox4);
        panel2.add(checkBox5);
        panel2.add(checkBox6);

        JPanel panel3 = new JPanel();
        panel3.setBounds(0, 600, 1200, 200);
        panel3.setBackground(Color.black);
        panel3.setLayout(null);
        panel3.add(register);

        this.setBounds(150, 10, 1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Student details");
        this.setIconImage(image1.getImage());
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.setVisible(true);

    }

    // Getters for getting username and password
    public static void getUseramePassword(ArrayList<String> upList) {
        list.add(0, upList.get(0));
        list.add(1, upList.get(1));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == register) {
                String str1 = new String("");
                String str2 = new String("");
                register.setEnabled(false);
                list.add(2, textField1.getText());
                list.add(3, textField2.getText());
                list.add(4, textField3.getText());
                list.add(5, textField4.getText());

                if (rb1.isSelected()) {
                    list.add(6, "Online");
                } else if (rb2.isSelected()) {
                    list.add(6, "Cash");
                } else {
                    list.add(6, "Pending");
                }

                if (checkBox1.isSelected()) {
                    str1 += "Music ";
                }
                if (checkBox2.isSelected()) {
                    str1 += "Dance ";
                }
                if (checkBox3.isSelected()) {
                    str1 += "Other ";
                }
                if (!checkBox1.isSelected() && !checkBox2.isSelected() && !checkBox3.isSelected()) {
                    str1 += "null";
                }
                list.add(7, str1);
                if (checkBox4.isSelected()) {
                    str2 += "Cricket ";
                }
                if (checkBox5.isSelected()) {
                    str2 += "Volleyball ";
                }
                if (checkBox6.isSelected()) {
                    str2 += "Badminton ";
                }
                if (!checkBox4.isSelected() && !checkBox5.isSelected() && !checkBox6.isSelected()) {
                    str2 += "null";
                }
                list.add(8, str2);

                // Calling getter fuction of Operation
                Operations.getList(list);

                // Calling function to insert data
                Operations.insertData();
                this.dispose();

                // Displaying Completion Page
                new CompletionPage();
            }

        } catch (Exception p) {
            System.out.println("Details page error");
            p.printStackTrace();
        }
    }

    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == textField1) {
            Border b = BorderFactory.createLineBorder(Color.pink, 2);
            textField1.setBorder(b);
        }

        if (e.getSource() == textField2) {
            Border b = BorderFactory.createLineBorder(Color.pink, 2);
            textField2.setBorder(b);
        }

        if (e.getSource() == textField3) {
            Border b = BorderFactory.createLineBorder(Color.pink, 2);
            textField3.setBorder(b);
        }

        if (e.getSource() == textField4) {
            Border b = BorderFactory.createLineBorder(Color.pink, 2);
            textField4.setBorder(b);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == textField1) {
            Border b = BorderFactory.createLineBorder(Color.decode("#232323"));
            textField1.setBorder(b);
        }

        if (e.getSource() == textField2) {
            Border b = BorderFactory.createLineBorder(Color.decode("#232323"));
            textField2.setBorder(b);
        }

        if (e.getSource() == textField3) {
            Border b = BorderFactory.createLineBorder(Color.decode("#232323"));
            textField3.setBorder(b);
        }

        if (e.getSource() == textField4) {
            Border b = BorderFactory.createLineBorder(Color.decode("#232323"));
            textField4.setBorder(b);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}
