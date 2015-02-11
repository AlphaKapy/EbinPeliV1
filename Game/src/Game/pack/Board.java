/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.pack;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Ghost
 */
public class Board extends JPanel implements ActionListener {
    Ship ship1;
    Image img;
    Timer time;
    public Board(){
        ship1 = new Ship();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon i = new ImageIcon("./img/bg.png");
        time = new Timer(5, this);
        time.start();
        
    }
    public void actionPerformed(ActionEvent e){
        ship1.move();
        repaint();
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawImage(img, 0, 0, null); //draws background
        g2d.drawImage(ship1.getStill(), ship1.getX(), ship1.getY(), null);
    }
    private class AL extends KeyAdapter{
        public void keyReleased(KeyEvent e){
            ship1.keyReleased(e);
        }
        public void keyPressed(KeyEvent e){
            ship1.keyPressed(e);
        }
    }
}
