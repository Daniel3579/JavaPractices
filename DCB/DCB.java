package DCB;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DCB {
    private BufferedImage[] frames = new BufferedImage[256];

    public DCB() {
        int i, j, k, r, g, b;
        BufferedImage image;
        File output;
        Color color;

        image = new BufferedImage(256, 256, 1);
        output = new File("DCB.jpg");

        for (i = 0; i < 256; i++) {
            for (j = 0; j < 256; j++) {
                for (k = 0; k < 256; k++) {
                    r = i;
                    g = j;
                    b = k;

                    color = new Color(r, g, b);

                    image.setRGB(g, b , color.getRGB());
                }
            }

            try {
                ImageIO.write(image, "jpg", output);
                frames[i] = ImageIO.read(output);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private int function(int x) {
        if (x < 256) {
            return (x*x + 3*x + 2) / 2;

        } else if (x < 511) {
            return -(x*x) + 765*x - 97154;

        } else {
            return (x*x - 1533*x + 587522) / 2;
        }
    }

    public void animation() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(256, 256);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel animation = new JLabel(new ImageIcon(frames[0]));
        frame.add(animation, BorderLayout.CENTER);

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

        Timer timer = new Timer(17, animate);
        timer.start();
    }
}
