/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Game_FlappBird_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.PopupMenu;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LUONG VU
 */
public class Game extends JPanel implements Runnable{
    private Cylinder cylinder = new Cylinder();
    private Bird bird = new Bird();
    private Check check = new Check();
    private Source source = new Source();
    private static boolean bl = false;
    private BufferedImage bg, land, gameover, newGameImage;
    private Thread threadT;

    public Game() {
        StartGame a = new StartGame();
        threadT = new Thread(this);
        threadT.start(); //khi goi lenh nay se duoc chuyen den phuong thuc run() phia duoi
    }

    public void paint(Graphics g) {
        
        
        
        try {
            
            bg = ImageIO.read(new File("BG.png"));
            g.drawImage(bg, 0, 0, null);

            //add
            cylinder.paint(g);

            land = ImageIO.read(new File("land.png"));
            g.drawImage(land, 0, 400, null);

            //Add bird to game
            bird.paint(g);

            g.setColor(Color.BLACK); //color
            g.setFont(new Font("Arial", Font.BOLD, 20)); //font, type, size
            g.drawString("Điểm: " + source.getSource(), 10, 20); //Add string Điểm

            if (bl == true) {
                gameover = ImageIO.read(new File("GameOver.png"));
                g.drawImage(gameover, 120, 175, null);
            }
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        
        
        //Vòng lặp game
        while (true) {
            repaint(); // goi lai paint
            cylinder.downX(); // 
            try {
                Thread.sleep(30); // chuong trinh dung lai 5 ms
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
            cylinder.parrot();  
            bird.down();
            source.addSource();
            //Check die
            if (check.die() == true) {
                bl = true;
                repaint();
                threadT.stop();
            }
        }
    }

    public void newGame(Graphics g){
        
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setResizable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}