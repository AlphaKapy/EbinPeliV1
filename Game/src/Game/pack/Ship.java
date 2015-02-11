/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.pack;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Ghost
 */
public class Ship {
    int x, y,dy, dx;
    Image still;
    public Ship(){
        ImageIcon i = new ImageIcon("./img/ship.png");
        still = i.getImage();
        x=10;
        y=172;
    }
    public void move(){
        x = x +dx;
        y = y + dy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public Image getStill() {
        return still;
    }

    public void setStill(Image still) {
        this.still = still;
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT)
            dx = -1;
        
        if(key ==KeyEvent.VK_RIGHT)
            dx = 1;
        if(key ==KeyEvent.VK_DOWN)
            dy = 1;
        if(key ==KeyEvent.VK_UP)
            dy = -1;
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT)
            dx = 0;
        
        if(key ==KeyEvent.VK_RIGHT)
            dx = 0;
        if(key ==KeyEvent.VK_DOWN)
            dy = 0;
        if(key ==KeyEvent.VK_UP)
            dy = 0;
    }
}
