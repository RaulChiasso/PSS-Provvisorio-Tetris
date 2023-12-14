package main;

import java.awt.Graphics2D;

public class PlayManager {
    
    //Main Play Area
    final int WIDTH=360;
    final int HEIGHT=600;
    public static int left_x;
    public static int right_x;
    public static int top_y;
    public static int bottom_y;


    public PlayManager() {
        left_x = (GamePanel.WIDTH/2) - WIDTH/2;
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGHT;
    }

    public void update() {

    }

    public void draw(Graphics2D g2) {

    }
        
}
