
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author cli
 */
public class Player extends javax.swing.JPanel {
    private int sum6 = 0;
    private int sum = 0;
    private int moves = 0;
    private boolean bonus;
    private boolean[] isSelected;
    private int[] cPoints;
    private String name[] = {"Aces","Twos","Threes","Fours","Fives","Sixes","Three Of A Kind","Four Of A Kind","Full House","Small Straight","Large Straight","Yahtzee","Chance"};

    
     
    public Player() {
        initComponents();
        initButtons();
    }
    
    public void initButtons(){
        sums = new javax.swing.JLabel();
        sums.setText("0");
        this.add(sums, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0, 100, 30));
        combinations = new javax.swing.JButton[13];
        for (int i = 0; i<13; i++){
            combinations[i] = new javax.swing.JButton();
            combinations[i].setText(name[i]);
            this.add(combinations[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50*i, 150, 50));
            int index = i;
            combinations[i].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    JButton combSelected =(JButton)evt.getSource();
                    combSelected.setEnabled(false);
                    sum += cPoints[index];
                    if (index < 6){
                        if (cPoints[index]!=100){
                            sum6 += cPoints[index];
                            if (sum6 >= 63){
                                sum += 35;
                                System.out.println("bonus for group 1");
                            }
                        }
                    } else if (index == 11 && cPoints[index] == 100) {
                        bonus = true;
                    }
                    
                    
                    sums.setText(Integer.toString(sum));
                    check(index);
                    moves++;
                }
            });
        }
        
        
        
        cPoints = new int[13];
        isSelected = new boolean[13];
    }
    
    
    public void setPoints(int[] cPoints){
        for (int i = 0; i<combinations.length;i++){
            this.cPoints[i]=cPoints[i];
            if(!isSelected[i]){
                combinations[i].setText(name[i]+" "+cPoints[i]);
            }
        }
    }
    
    public void check(int i){
        this.setEnabled(false);
    }
    
    public void resetGame(){
        sum=0;
        sum6=0;
        moves=0;
        bonus=false;
        for (int i = 0; i<13; i++){
            combinations[i].setText(name[i]);
            combinations[i].setEnabled(true);
            isSelected[i]=false;
            cPoints[i]=0;
        }
        sums.setText(Integer.toString(sum));
        this.setEnabled(true);
    }
    
    public int getMoves(){
        return moves;
    }
    
    public int getSum(){
        return sum;
    }
    
    public boolean getBonus(){
        return bonus;
    }
    
    public void setBonus(boolean bonus){
        this.bonus=bonus;
    }
    
    

    
    
    
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private javax.swing.JButton combinations[];
    private javax.swing.JLabel sums;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
