/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Dceron
 */
public class window extends JFrame {
    Container container1;
    layoutTop top = new layoutTop();
    layoutCenter center = new layoutCenter();
    public window() {
    }

    public window(String title) {
        super(title);
        setBounds(150, 200, 400, 500);
       
        setLayout(new BorderLayout());
        container();
        this.setBackground(new Color(96, 111, 140));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void container() {
        container1 = getContentPane();
        container1.setLayout(new BorderLayout(10,10));
        container1.setBackground(new Color(96, 111, 140));
        
        container1.add(top,BorderLayout.NORTH);
        top.centerInTop=this.center;
        
        container1.add(center, BorderLayout.CENTER);
        center.topInCenter=this.top;
        
        
        
    }

}
