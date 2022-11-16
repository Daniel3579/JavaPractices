package Lab_5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Animation extends JFrame {
    private Image[] frames = {
            ImageIO.read(new File("./src/Lab_5/Frames/1.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/2.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/3.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/4.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/5.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/6.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/7.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/8.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/9.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/10.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/11.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/12.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/13.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/14.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/15.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/16.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/17.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/18.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/19.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/20.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/21.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/22.png")),
            ImageIO.read(new File("./src/Lab_5/Frames/23.png"))
    };

    public Animation() throws IOException {
        super("Animation");
        setVisible(true);
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel animation = new JLabel(new ImageIcon(frames[0]));
        add(animation, BorderLayout.CENTER);

        ActionListener animate = new ActionListener() {
            private int index = 0;
            private boolean flag = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < frames.length - 1 && !flag) {
                    index++;

                    if (index == frames.length - 1) {
                        flag = true;
                    }

                } else if (index > 0 && flag) {
                    index--;

                    if (index == 0) {
                        flag = false;
                    }
                }

                animation.setIcon(new ImageIcon(frames[index]));
            }
        };

        Timer timer = new Timer(40, animate);
        timer.start();
    }
}