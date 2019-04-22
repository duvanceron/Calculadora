/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class layoutTop extends JPanel {

    JTextArea fieldResults;
    layoutCenter centerInTop;

    public layoutTop() {
        setBackground(new Color(96, 111, 140));
        setLayout(new FlowLayout());
        components();
    }

    private void components() {
        fieldResults = new JTextArea(2, 10);
        JScrollPane scroll = new JScrollPane(fieldResults);
        fieldResults.setFont(fieldResults.getFont().deriveFont(40f));
        
        this.add(scroll);

    }

}
