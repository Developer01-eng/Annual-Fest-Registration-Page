
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DisplayDataPage extends JFrame {
  DisplayDataPage(String data[][], int info1, int info2, int info3, int info4, int info5, int info6, int info7,
      int info8, int info9) {

    JLabel label1 = new JLabel("No. of Cricket Players is " + info1);
    label1.setFont(new Font("Times Roman", Font.BOLD, 15));
    label1.setBounds(0, 0, 1390, 20);
    JLabel label2 = new JLabel("No. of Volleyball Players is " + info2);
    label2.setFont(new Font("Times Roman", Font.BOLD, 15));
    label2.setBounds(0, 20, 1390, 20);
    JLabel label3 = new JLabel("No. of Badminton Players is " + info3);
    label3.setFont(new Font("Times Roman", Font.BOLD, 15));
    label3.setBounds(0, 40, 1390, 20);
    JLabel label4 = new JLabel("No. of Music Participants is " + info4);
    label4.setFont(new Font("Times Roman", Font.BOLD, 15));
    label4.setBounds(0, 60, 1390, 20);
    JLabel label5 = new JLabel("No. of Dance Participants is " + info5);
    label5.setFont(new Font("Times Roman", Font.BOLD, 15));
    label5.setBounds(0, 80, 1390, 20);
    JLabel label6 = new JLabel("No. of Other Participants is " + info6);
    label6.setFont(new Font("Times Roman", Font.BOLD, 15));
    label6.setBounds(0, 100, 1390, 20);
    JLabel label7 = new JLabel("Total amount received is " + info7);
    label7.setFont(new Font("Times Roman", Font.BOLD, 15));
    label7.setBounds(0, 120, 1390, 20);
    JLabel label8 = new JLabel(info8 + " people amount is pending which is " + (info8 * 500));
    label8.setFont(new Font("Times Roman", Font.BOLD, 15));
    label8.setBounds(0, 140, 1390, 20);
    JLabel label9 = new JLabel("Total students attending the fest is " + info9);
    label9.setFont(new Font("Times Roman", Font.BOLD, 15));
    label9.setBounds(0, 160, 1390, 20);

    JPanel panel = new JPanel();
    panel.setBounds(5, 505, 1390, 300);
    panel.setLayout(null);
    panel.add(label1);
    panel.add(label2);
    panel.add(label3);
    panel.add(label4);
    panel.add(label5);
    panel.add(label6);
    panel.add(label7);
    panel.add(label8);
    panel.add(label9);

    String columnName[] = { "Username", "Password", "Name", "Course", "Year", "Roll No.", "Payment Mode",
        "Cultural Events Participants", "Participation in Sports" };
    JTable table = new JTable(data, columnName);
    JScrollPane sp = new JScrollPane(table);
    sp.setBounds(5, 5, 1380, 500);

    ImageIcon image = new ImageIcon("face.png");
    this.setBounds(80, 10, 1400, 800);
    this.setResizable(false);
    this.setTitle("Students Data");
    this.setIconImage(image.getImage());
    this.add(panel);
    this.add(sp);
    this.setLayout(null);
    this.setVisible(true);
  }
}
