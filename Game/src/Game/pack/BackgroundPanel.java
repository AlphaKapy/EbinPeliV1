/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.pack;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

/**
 *
 * @author Eurybus
 */
public class BackgroundPanel extends Panel {
    Image img;
    public void BackgroundPanel(){
        img = Toolkit.getDefaultToolkit().createImage("./img/bg1.jpg");
    }
    public void Paint(Graphics g){
        g.drawImage(img, 0,0, null);
    }    
}
