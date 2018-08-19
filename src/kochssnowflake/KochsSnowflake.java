package kochssnowflake;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class KochsSnowflake extends JApplet {

    private JTextField tfLevel = new JTextField("0", 5);

    public KochsSnowflake() {

        KochsSnowflakeRecursion snowflake = new KochsSnowflakeRecursion();
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter level: "));
        panel.add(tfLevel);
        tfLevel.setHorizontalAlignment(SwingConstants.RIGHT);

        add(snowflake);
        add(panel, BorderLayout.SOUTH);

        tfLevel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                snowflake.setLevel(Integer.parseInt(tfLevel.getText()));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Koch's Snowflake");
        KochsSnowflake applet = new KochsSnowflake();
        frame.add(applet);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

}
