
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class CompletionPage extends JFrame {

    CompletionPage() {

        ImageIcon icon = new ImageIcon("Vlogo.png");

        JLabel label1 = new JLabel("VIBRANCE Registration");
        label1.setBounds(90, 50, 600, 50);
        label1.setFont(new Font("Times Roman", Font.BOLD, 40));
        label1.setForeground(Color.black);

        JLabel label2 = new JLabel("Successfull!!");
        label2.setBounds(90, 100, 600, 50);
        label2.setFont(new Font("Times Roman", Font.BOLD, 40));
        label2.setForeground(Color.black);

        JLabel label3 = new JLabel("Thank you very much for your precious time.");
        label3.setBounds(90, 150, 600, 50);
        label3.setFont(new Font("Times Roman", Font.BOLD, 20));

        JPanel panel1 = new JPanel();
        panel1.setBounds(250, 100, 700, 400);
        panel1.setLayout(null);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);

        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 0, 1200, 800);
        panel2.setLayout(null);
        panel2.setBackground(Color.black);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1200, 800);
        layeredPane.add(panel1, JLayeredPane.DRAG_LAYER);
        layeredPane.add(panel2, JLayeredPane.DEFAULT_LAYER);

        this.setBounds(150, 10, 1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.black);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Completion Page");
        this.setIconImage(icon.getImage());
        this.add(layeredPane);
        this.setVisible(true);
    }
}
