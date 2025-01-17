import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UpdatePopup extends JFrame implements ActionListener {
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JButton button1;
    JButton button2;

    UpdatePopup() {

        JLabel label1 = new JLabel("Enter username, password and new roll no.");
        label1.setFont(new Font("Times Roman", Font.BOLD, 15));
        label1.setBounds(20, 5, 400, 20);
        JLabel label2 = new JLabel("Username");
        label2.setFont(new Font("Times Roman", Font.BOLD, 15));
        label2.setBounds(50, 40, 80, 20);
        JLabel label3 = new JLabel("Password");
        label3.setFont(new Font("Times Roman", Font.BOLD, 15));
        label3.setBounds(50, 70, 80, 20);
        JLabel label4 = new JLabel("New Roll NO.");
        label4.setFont(new Font("Times Roman", Font.BOLD, 15));
        label4.setBounds(30, 100, 100, 20);

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField1.setBounds(130, 40, 200, 20);
        textField2.setBounds(130, 70, 200, 20);
        textField3.setBounds(130, 100, 200, 20);

        button1 = new JButton("OK");
        button2 = new JButton("Cancel");
        button1.setBounds(120, 135, 60, 20);
        button2.setBounds(200, 135, 80, 20);
        button1.setFocusable(false);
        button2.setFocusable(false);
        button1.addActionListener(this);
        button2.addActionListener(this);

        this.setBounds(600, 300, 400, 200);
        this.getContentPane().setBackground(Color.decode("#FFFAFA"));
        this.setLayout(null);
        this.setResizable(false);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(textField1);
        this.add(textField2);
        this.add(textField3);
        this.add(button1);
        this.add(button2);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button1.setEnabled(false);
        button2.setEnabled(false);

        if (e.getSource() == button1) {
            String str1 = textField3.getText();
            String str2 = textField1.getText();
            String str3 = textField2.getText();

            // Method to update password
            Operations.updatePassword(str1, str2, str3);
        }

        this.dispose();
    }
}
