/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Game_FlappBird_Project;

import java.awt.Graphics;
import java.awt.PopupMenu;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author LUONG VU
 */
public class StartGame extends JFrame {
    private Bird bird = new Bird();
    
    public StartGame(){
         try {
            setSize(500, 500); //Windown 500x500
            setVisible(true); //Display true
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close button
            setLocation(400, 100); //Location
            setResizable(false);
            PopupMenu game;
            JLabel label1 = new JLabel();
            add(label1);
            label1.setSize(350, 350);
            ImageIcon icon = new ImageIcon("GetReady.png");
            label1.setIcon(icon);
            
            JLabel label2 = new JLabel();
            add(label2);
            label2.setSize(100, 100);
            ImageIcon icon2 = new ImageIcon("Bird.png");
            
            JLabel label3 = new JLabel();
            add(label3);
            label3.setSize(350, 350);
            ImageIcon icon3 = new ImageIcon("BG.png");
            label3.setIcon(icon3);
            
            label2.setIcon(icon2);
            
            

            Thread.sleep(5000); // chuong trinh dung lai 5000 ms
            this.hide();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
