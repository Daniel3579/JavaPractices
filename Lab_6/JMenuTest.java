package Lab_6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JMenuTest extends JFrame {
    public JTextArea area = new JTextArea(16, 24);

    public JMenuTest() {
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        JMenuBar menuBar = new JMenuBar();

        menuBar.add(createColorMenu());
        menuBar.add(createFontMenu());
        setJMenuBar(menuBar);

        area.setLineWrap(true);
        JPanel contents = new JPanel();
        contents.add(area);
        setContentPane(contents);

        setSize(300, 200);
        setVisible(true);
    }

    private JMenu createColorMenu() {
        JMenu file = new JMenu("Color");

        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem black = new JMenuItem("Black");

        file.add(blue);
        file.add(red);
        file.add(black);

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.blue);
            }
        });

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.red);
            }
        });

        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.black);
            }
        });

        return file;
    }

    private JMenu createFontMenu() {
        JMenu file = new JMenu("Font");

        JMenuItem times_new_roman = new JMenuItem("Times New Roman");
        JMenuItem ms_sans_serif = new JMenuItem("MS Sans Serif");
        JMenuItem courier_new = new JMenuItem("Courier New");

        file.add(times_new_roman);
        file.add(ms_sans_serif);
        file.add(courier_new);

        times_new_roman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Times New Roman", Font.PLAIN, 14);
                area.setFont(font);
            }
        });

        ms_sans_serif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("MS Sans Serif", Font.PLAIN, 14);
                area.setFont(font);
            }
        });

        courier_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Courier New", Font.PLAIN, 14);
                area.setFont(font);
            }
        });

        return file;
    }

    public static void main(String[] args) {
        new JMenuTest();
    }
}