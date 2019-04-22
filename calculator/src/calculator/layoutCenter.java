package calculator;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class layoutCenter extends JPanel implements ActionListener {

    String[] operations = {"/", "*", "-", "+", "=", "c"};
    operations newOperation=new operations();
    JButton[] Button = new JButton[16];
    layoutTop topInCenter;

    public layoutCenter() {
        setBackground(new Color(96, 111, 140));
        this.setLayout(new GridLayout(4, 4, 10, 10));
        this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        components();
    }

    private void components() {

        for (int i = 0; i <= 9; i++) {
            Button[i] = new JButton("" + i);
            Button[i].addActionListener(this);

        }
        int operation = 0;
        for (int i = 10; i <= 15; i++) {

            Button[i] = new JButton(operations[operation]);
            Button[i].setFont(Button[i].getFont().deriveFont(25f));
            Button[i].addActionListener(this);
            operation++;
        }
        this.add(Button[7]);
        this.add(Button[8]);
        this.add(Button[9]);
        this.add(Button[10]);
        this.add(Button[4]);
        this.add(Button[5]);
        this.add(Button[6]);
        this.add(Button[11]);
        this.add(Button[1]);
        this.add(Button[2]);
        this.add(Button[3]);
        this.add(Button[12]);
        this.add(Button[0]);
        this.add(Button[13]);
        this.add(Button[15]);
        this.add(Button[14]);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        String nombreBoton = boton.getText();

        switch (nombreBoton) {
            case "/":
                break;
            case "*":
                break;
            case "-":
                break;
            case "+":
                double a=Double.valueOf(topInCenter.fieldResults.getText());
                 topInCenter.fieldResults.setText("");
                break;
            case "=":
                break;
            case "c":
                break;
            default:
                System.out.println("ahi");
                for (int i = 0; i <=9; i++) {
                    System.out.println("---"+i);
                    if (e.getSource()==Button[i]) {
                      topInCenter.fieldResults.setText(topInCenter.fieldResults.getText()+Button[i].getText());
                    }
 
                }
                break;
        }

    }

}
