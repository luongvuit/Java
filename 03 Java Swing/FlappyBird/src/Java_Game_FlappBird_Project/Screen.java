/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Game_FlappBird_Project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author LUONG VU
 */
public class Screen extends JFrame { //Inherit JFrame
    private Game game = new Game(); //Create a class game
    private Bird bird = new Bird();

    public Screen() {
        setSize(500, 500); //Windown 500x500
        setVisible(true); //Display true
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close button
        setLocation(400, 100); //Location
        setResizable(false);
        add(game); //Add class game to Screen
        
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                if (bird.getY() >= 0) {
                    bird.up();
                }
            }
        });
    }

    public static void main(String[] args) {
        Screen screen = new Screen(); //Main
    }
}
