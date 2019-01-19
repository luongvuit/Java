/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Game_FlappBird_Project;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author LUONG VU
 */
public class Bird {
    private static int y = 200;
    private static int x = 100;
    private BufferedImage bird;

    //lay ra gia tri y
    public static int getY() {
        return y;
    }

    //lay ra gia tri x
    public static int getX() {
        return x;
    }

    public void paint(Graphics g) {
        try {
            bird = ImageIO.read(new File("Bird.png"));
            g.drawImage(bird, x, y, null);
        } catch (IOException ex) {
            Logger.getLogger(Bird.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Bird go to down
    public void down() {
        y++;
    }

    //Bird go to up
    public void up() {
//        y = y -40;
        y -= 30;
    }
}
