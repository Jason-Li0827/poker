
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JToggleButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cli
 */
public class Dice extends JToggleButton{
    private int n;
    public Dice(){
        n = new Random().nextInt(6)+1;
        this.setSize(40,40);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int n = getN();
        switch (n){
            case 1:
                g.fillOval(9, 5, 5, 5);
                break;
            case 2:
                g.fillOval(9, 5, 5, 5);
                g.fillOval(19, 5, 5, 5);
                break;
            case 3:
                g.fillOval(9, 5, 5, 5);
                g.fillOval(19, 5, 5, 5);
                g.fillOval(9, 15, 5, 5);
                break;
            case 4:
                g.fillOval(9, 5, 5, 5);
                g.fillOval(19, 5, 5, 5);
                g.fillOval(9, 15, 5, 5);
                g.fillOval(19, 15, 5, 5);
                break;
            case 5:
                g.fillOval(9, 5, 5, 5);
                g.fillOval(19, 5, 5, 5);
                g.fillOval(9, 15, 5, 5);
                g.fillOval(19, 15, 5, 5);
                g.fillOval(9, 25, 5, 5);
                break;
            case 6:
                g.fillOval(9, 5, 5, 5);
                g.fillOval(19, 5, 5, 5);
                g.fillOval(9, 15, 5, 5);
                g.fillOval(19, 15, 5, 5);
                g.fillOval(9, 25, 5, 5);
                g.fillOval(19, 25, 5, 5);
                break;
        }
    }
    
    public void throwDice(){
        n = new Random().nextInt(6)+1;
        repaint();
    }
    
    public int getN(){
        return n;
    }
}
