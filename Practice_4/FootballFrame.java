package Practice_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballFrame extends JFrame {

    private int scMadrid = 0;
    private int scMilan = 0;
    private JLabel score = new JLabel("Result: 0 X 0");
    private JLabel winner = new JLabel("Winner: DRAW");
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private JButton madrid = new JButton("Real Madrid");
    private JButton milan = new JButton("AC Milan");

    public FootballFrame() {
        super("new game");
        setVisible(true);
        setSize(400, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(score, BorderLayout.CENTER);
        add(winner, BorderLayout.NORTH);
        add(lastScorer, BorderLayout.SOUTH);
        add(madrid, BorderLayout.WEST);
        add(milan, BorderLayout.EAST);

        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateUI(0,1);
            }
        });

        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateUI(1,0);
            }
        });

    }

    private void updateUI(int milan, int madrid) {
        scMadrid += madrid;
        scMilan += milan;

        score.setText("Result:" + scMadrid + "X" + scMilan);

        if (scMilan > scMadrid) {
            winner.setText("Winner: AC Milan");

        } else if (scMilan < scMadrid) {
            winner.setText("Winner: Real Madrid");

        } else {
            winner.setText("Winner: DRAW");
        }

        if (milan == 1) {
            lastScorer.setText("Last Scorer: AC Milan");

        } else {
            lastScorer.setText("Last Scorer: Real Madrid");
        }
    }
}