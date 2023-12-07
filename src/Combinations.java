
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cli
 */
public class Combinations {
    private int[] count = new int[6];
    private int sum = 0;
    public Combinations(int[] dicePoints) {
        for (int i = 0; i<5; i++){
            count[dicePoints[i]-1]++;
            sum = sum + dicePoints[i];
        }
    }
    
    public int combination1(){
        return count[0]*1;
    }
    
    public int combination2(){
        return count[1]*2;
    }
    
    public int combination3(){
        return count[2]*3;
    }
    
    public int combination4(){
        return count[3]*4;
    }
    
    public int combination5(){
        return count[4]*5;
    }
    
    public int combination6(){
        return count[5]*6;
        //return 60;
    }
    
    public int combination7(){
        for (int i = 0; i<6; i++){
            if (count[i]>=3){
                return sum;
            }
        }
        return 0;
    }
    
    public int combination8(){
        for (int i = 0; i<6; i++){
            if (count[i]>=4){
                return sum;
            }
        }
        return 0;
    }
    
    public int combination9(){
        for (int i = 0; i<6; i++){
            if (count[i]==2){
                for (int j = 0; j<6; j++){
                    if (count[j]==3){
                        return 25;
                    }
                }
            } else if (count[i] == 3){
                for (int j = 0; j<6; j++){
                    if (count[j]==2){
                        return 25;
                    }
                }
            }
        }
        return 0;
    }
    
    public int combination10(){
        int n = 0;
        for (int i = 0; i<6; i++){
            if (count[i]>=1){
                n++;
                if (n>=4){
                    return 30;
                }
            } else {
                n=0;
            }
        }
        return 0;
    }
    
    public int combination11(){
        int n = 0;
        for (int i = 0; i<6; i++){
            if (count[i]>=1){
                n++;
                if (n>=5){
                    return 40;
                }
            } else {
                n=0;
            }
        }
        return 0;
    }
    
    public int combination12(){
        for (int i = 0; i<6; i++){
            if (count[i]==5){
                return 50;
            }
        }
        return 0;
    }
    
    public int combination13(){
        return sum;
    }
    
    public int[] getPoints(){
        int[] points = new int[13];
        for (int i=1; i<14;i++){
            try {
                Method method = Combinations.class.getDeclaredMethod("combination"+i);
                points[i-1] = (Integer) method.invoke(this);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(Combinations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(Combinations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Combinations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(Combinations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(Combinations.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return points;
    }
}
