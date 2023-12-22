package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class PlayManager {
    public static final int BORDER=4;
    
    //Main PlayArea
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

        //Draw PlayArea
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(left_x-BORDER, top_y-BORDER, WIDTH+BORDER*2, HEIGHT+BORDER*2);

        //Draw next block window
        int x = right_x + 100;
        int y = bottom_y - 200;
        g2.drawRect(x, y, 200, 200);
        g2.setFont(new Font("Arial", Font.PLAIN, 30));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.drawString("NEXT", x+60, y+60);
    }
        
}
