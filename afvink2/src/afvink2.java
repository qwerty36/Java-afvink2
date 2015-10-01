import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class afvink2 extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField field, field2;
    private JButton button;
    private JLabel XLabel1, YLabel1;

    public static void main(String[] args) {
        afvink2 frame = new afvink2();
        frame.setSize(700, 750);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setTitle("NSA PRISM VISUALISER");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(665, 530));
        panel.setBackground(Color.white);
        window.add(panel);
        XLabel1 = new JLabel("X");
        window.add(XLabel1);
        field = new JTextField(3);
        window.add(field);
        YLabel1 = new JLabel("Y");
        window.add(YLabel1);
        field2 = new JTextField(3);
        window.add(field2);

        button = new JButton("Draw That Shit");
        button.addActionListener(this);
        window.add(button);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.white);
        paper.fillRect(0, 0, 300, 300);

        int number1 = Integer.parseInt(field.getText());
        int number2 = Integer.parseInt(field2.getText());

        paper.setColor(Color.black);
        paper.drawLine(40 + number1, 30 + number2, 180 + number1, 100 + number2);
        paper.drawLine(40 + number1, 160 + number2, 165 + number1, 130 + number2);
        paper.setColor(Color.blue);
        paper.fillOval(10 + number1, 10 + number2, 70, 70);
        paper.setColor(Color.blue);
        paper.fillOval(10 + number1, 130 + number2, 70, 70);
        paper.setColor(Color.red);
        paper.fillOval(160 + number1, 70 + number2, 90, 90);

    }
}