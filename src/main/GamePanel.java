package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    public static final int WIDTH=1280;
    public static final int HEIGHT=720;

    final int FPS = 60;
    Thread gameThread;

    PlayManager pm;

    public GamePanel() {

        //Panel settings
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);

        pm = new PlayManager();
    }

    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        //Gameloop
        //update and repaint the panel 60 times per seconds
        double drawIntervental = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while(gameThread != null) {
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawIntervental;
            lastTime = currentTime;

            if(delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    public void update() {
        pm.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        pm.draw(g2);
    }
}
