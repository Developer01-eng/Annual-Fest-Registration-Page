import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class RegistrationPage extends JFrame implements ActionListener, MouseListener {
    JButton submit;
    JTextField textField;
    JPasswordField passwordField;
    ArrayList<String> upList = new ArrayList<>();

    RegistrationPage() throws FontFormatException, IOException {

        // Creating custom font
        Font customFont1 = Font.createFont(Font.TRUETYPE_FONT, new File("AL_Nevrada.otf"));
        customFont1 = customFont1.deriveFont(Font.PLAIN, 50);

        Font customFont2 = Font.createFont(Font.TRUETYPE_FONT, new File("ROOSTER.ttf"));
        customFont2 = customFont2.deriveFont(Font.PLAIN, 50);

        ImageIcon icon1 = new ImageIcon("Vlogo.png");
        ImageIcon icon2 = new ImageIcon("davv.jpg");

        JLabel label1 = new JLabel("SCHOOL OF ELECTRONICS");
        label1.setBounds(100, 0, 1000, 250);
        label1.setFont(new Font("Times Roman", Font.BOLD, 30));
        label1.setForeground(Color.gray);
        label1.setIcon(icon2);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setIconTextGap(5);

        JLabel label2 = new JLabel("presents");
        label2.setBounds(100, 250, 1000, 50);
        label2.setForeground(Color.pink);
        label2.setFont(customFont2);
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.CENTER);

        JLabel label3 = new JLabel("VIBRANCE");
        label3.setBounds(100, 300, 1000, 100);
        label3.setFont(customFont1);
        label3.setForeground(new Color(192, 192, 192));
        label3.setHorizontalAlignment(JLabel.CENTER);

        JLabel label4 = new JLabel("Username");
        label4.setBounds(290, 50, 140, 40);
        label4.setFont(new Font("Times Roman", Font.BOLD, 25));
        label4.setForeground(new Color(255, 255, 255));

        textField = new JTextField();
        textField.setBounds(430, 50, 400, 30);
        textField.setBackground(Color.decode("#626262"));
        textField.setFont(new Font("Times Roman", Font.PLAIN, 20));
        textField.setForeground(Color.white);
        textField.setCaretColor(Color.white);
        Border b1 = BorderFactory.createLineBorder(Color.decode("#232323"));
        textField.setBorder(b1);
        textField.addMouseListener(this);

        JLabel label5 = new JLabel("Password");
        label5.setBounds(290, 90, 140, 40);
        label5.setFont(new Font("Times Roman", Font.BOLD, 25));
        label5.setForeground(new Color(255, 255, 255));

        passwordField = new JPasswordField();
        passwordField.setBounds(430, 90, 400, 30);
        passwordField.setBackground(Color.decode("#626262"));
        passwordField.setFont(new Font("Times Roman", Font.PLAIN, 20));
        passwordField.setForeground(Color.white);
        passwordField.setCaretColor(Color.white);
        Border b2 = BorderFactory.createLineBorder(Color.decode("#232323"));
        passwordField.setBorder(b2);
        passwordField.addMouseListener(this);

        submit = new JButton("Submit");
        submit.setBackground(Color.pink);
        submit.setFont(new Font("Times Roman", Font.BOLD, 20));
        submit.setForeground(Color.white);
        submit.setBounds(500, 50, 150, 50);
        submit.setFocusable(false);
        submit.addActionListener(this);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 1200, 400);
        panel1.setBackground(Color.black);
        panel1.setLayout(null);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);

        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 400, 1200, 200);
        panel2.setBackground(Color.black);
        panel2.setLayout(null);
        panel2.add(label4);
        panel2.add(label5);
        panel2.add(passwordField);
        panel2.add(textField);

        JPanel panel3 = new JPanel();
        panel3.setBounds(0, 600, 1200, 200);
        panel3.setBackground(Color.black);
        panel3.setLayout(null);
        panel3.add(submit);

        this.setBounds(150, 10, 1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Annual Fest Registration");
        this.setIconImage(icon1.getImage());
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.setVisible(true);
    }

    public static void removePage(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            submit.setEnabled(false);
            String str1 = new String(textField.getText());
            String str2 = new String(passwordField.getPassword());

            // Check for admin login
            if (str1.equals("Admin@123") && str2.equals("Password@123")) {
                String respond[] = { " Read ", " Update ", " Delete " };
                int result = JOptionPane.showOptionDialog(null, "Which operation do you want to perform",
                        "Admin Operations", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        respond, null);

                // To read data
                if (result == 0) {
                    Operations.readAllData();
                    this.dispose();           
                }

                // To update password
                else if (result == 1) {
                    new UpdatePopup();
                }

                // To delete password
                else if (result == 2) {
                    String str = JOptionPane .showInputDialog("Enter Roll No. of the student which data you want to delete");
                    Operations.delete(str);
                    this.dispose();               
                }
            } else {
                upList.add(0, str1);
                upList.add(1, str2);

                // Calling Details page getter function
                DetailsPage.getUseramePassword(upList);

                // Displaying details page
                new DetailsPage();

                this.dispose();                 
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == textField) {
            Border b = BorderFactory.createLineBorder(Color.pink, 2);
            textField.setBorder(b);
        }
        if (e.getSource() == passwordField) {
            Border b = BorderFactory.createLineBorder(Color.pink, 2);
            passwordField.setBorder(b);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == textField) {
            Border b = BorderFactory.createLineBorder(Color.decode("#232323"));
            textField.setBorder(b);

        }
        if (e.getSource() == passwordField) {
            Border b = BorderFactory.createLineBorder(Color.decode("#232323"));
            passwordField.setBorder(b);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}
