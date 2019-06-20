/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author bazu15
 */
public class MainClass {
    
    public static void main(String[]args){
       JFrame frame = new JFrame("Snake");
       frame.setContentPane(new GamePanel());
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.pack();
       
       frame.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
    }
}
