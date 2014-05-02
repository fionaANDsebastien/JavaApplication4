/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java.awt.Graphics;
import javax.swing.JFrame;



/**
 *
 * @author anallysmith
 */

public class gui {

   
     
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame() {
            int screenWidth = 300;
            int screenHeight = 300;
            
            public void paint(Graphics g) {
                
                
                //the loop will run 10 times and each line will be 30 pixels apart.
                for (int i = 0; i < 11; i++) {
                    g.drawLine(i * 30, 0, i * 30, screenHeight);
                    
                }
                
                for (int j = 0; j < 11; j++) {
                    g.drawLine(0, j * 30, screenWidth, j * 30);
                    
                }
            }
        };
		
		frame.setSize(400,400);
		frame.setVisible(true);
    }
    
}
