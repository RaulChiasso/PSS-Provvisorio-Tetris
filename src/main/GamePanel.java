package main;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    public static final int WIDTH=1280;
    public static final int HEIGHT=720;

    final int FPS = 60;
    Thread gameThread;

    public GamePanel() {

        //Panel settings
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);
    }

    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
    }
}
