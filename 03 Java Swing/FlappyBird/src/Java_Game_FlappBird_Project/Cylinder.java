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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author LUONG VU
 */
public class Cylinder {
    private static int x1 = 500, x2 = x1 + 140, x3 = x2 + 140, x4 = x3 + 140;
    private static int h1, h2, h3, h4;
    private static boolean bl1 = false;
    private static boolean bl2 = false;
    private static boolean bl3 = false;
    private static boolean bl4 = false;
    private BufferedImage cylinder_on, cylinder_at;

    public static int getX1() {
        return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static int getX4() {
        return x4;
    }

    public static int getH1() {
        return h1;
    }

    public static int getH2() {
        return h2;
    }

    public static int getH3() {
        return h3;
    }

    public static int getH4() {
        return h4;
    }

    //Random
    public void random() {
        Random rd = new Random();
        if (bl1 == false) {
            h1 = rd.nextInt(200); //Random (0->199)
            bl1 = true;
        }
        if (bl2 == false) {
            h2 = rd.nextInt(200); 
            bl2 = true;
        }
        if (bl3 == false) {
            h3 = rd.nextInt(200);
            bl3 = true;
        }
        if (bl4 == false) {
            h4 = rd.nextInt(200);
            bl4 = true;
        }
    }

    public void paint(Graphics g) {
        try {
            random();
            cylinder_on = ImageIO.read(new File("cylinder_on.png"));
            cylinder_at = ImageIO.read(new File("cylinder_at.png"));
            g.drawImage(cylinder_on, x1, 0, 40, h1, null);
            g.drawImage(cylinder_at, x1, h1 + 100, 40, 500, null);
            g.drawImage(cylinder_on, x2, 0, 40, h2, null);
            g.drawImage(cylinder_at, x2, h2 + 100, 40, 500, null);
            g.drawImage(cylinder_on, x3, 0, 40, h3, null);
            g.drawImage(cylinder_at, x3, h3 + 100, 40, 500, null);
            g.drawImage(cylinder_on, x4, 0, 40, h4, null);
            g.drawImage(cylinder_at, x4, h4 + 100, 40, 500, null);
        } catch (IOException ex) {
            Logger.getLogger(Cylinder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void downX() {
        x1--;
        x2--;
        x3--;
        x4--;
    }

    public void parrot() { //repeat
        if (x1 == -65) {
            x1 = 500;
            bl1 = false;
        }
        if (x2 == -65) {
            x2 = 500;
            bl2 = false;
        }
        if (x3 == -65) {
            x3 = 500;
            bl3 = false;
        }
        if (x4 == -65) {
            x4 = 500;
            bl4 = false;
        }
    }
}
