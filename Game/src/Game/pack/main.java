/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.pack;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author Ghost
 */
public class Main {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Ebin Peli");
        frame.add(new Board());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024,640);
        frame.setVisible(true);
        frame.setBackground(Color.white);
    }
}
