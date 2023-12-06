package main;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    public static final int WIDTH=1280;
    public static final int HEIGHT=720;

    public GamePanel() {

        //Panel settings
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);
    }
}
