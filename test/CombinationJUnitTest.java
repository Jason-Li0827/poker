/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cli
 */
public class CombinationJUnitTest {
    Combinations comb1;
    Combinations comb2;
    Combinations comb3;
    Combinations comb4;
    Combinations comb5;
    Combinations comb6;
    Combinations comb7;
    
    
    public CombinationJUnitTest() {
        comb1=new Combinations(new int [] {3,3,3,4,5});//18
        comb2=new Combinations(new int [] {4,4,4,4,6});//22
        comb3=new Combinations(new int [] {1,2,2,3,4});
        comb4=new Combinations(new int [] {2,2,2,3,3});
        comb5=new Combinations(new int [] {1,2,3,4,6});
        comb6=new Combinations(new int [] {1,2,3,4,5});
        comb7=new Combinations(new int [] {1,1,1,1,1});
        
    }
    
    
    
    @Test
    public void test_combination7(){
        assertEquals(18,comb1.combination7());
        assertEquals(22,comb2.combination7());
        assertEquals(0,comb3.combination7());
        assertEquals(12,comb4.combination7());
        assertEquals(0,comb5.combination7());
        assertEquals(0,comb6.combination7());
        assertEquals(5,comb7.combination7());
    }
    
    @Test
    public void test_combination8(){
        assertEquals(0,comb1.combination8());
        assertEquals(22,comb2.combination8());
        assertEquals(0,comb3.combination8());
        assertEquals(0,comb4.combination8());
        assertEquals(0,comb5.combination8());
        assertEquals(0,comb6.combination8());
        assertEquals(5,comb7.combination8());
    }
    
    @Test
    public void test_combination9(){
        assertEquals(0,comb1.combination9());
        assertEquals(0,comb2.combination9());
        assertEquals(0,comb3.combination9());
        assertEquals(25,comb4.combination9());
        assertEquals(0,comb5.combination9());
        assertEquals(0,comb6.combination9());
        assertEquals(0,comb7.combination9());
    }
    
    @Test
    public void test_combination10(){
        assertEquals(0,comb1.combination10());
        assertEquals(0,comb2.combination10());
        assertEquals(30,comb3.combination10());
        assertEquals(0,comb4.combination10());
        assertEquals(30,comb5.combination10());
        assertEquals(30,comb6.combination10());
        assertEquals(0,comb7.combination10());
        
    }
    
    @Test
    public void test_combination11(){
        assertEquals(0,comb1.combination11());
        assertEquals(0,comb2.combination11());
        assertEquals(0,comb3.combination11());
        assertEquals(0,comb4.combination11());
        assertEquals(0,comb5.combination11());
        assertEquals(40,comb6.combination11());
        assertEquals(0,comb7.combination11());
    }
    
    @Test
    public void test_combination12(){
        assertEquals(50,comb7.combination12());
        assertEquals(0,comb6.combination12());
    }
    
    @Test
    public void test_combination13(){
        assertEquals(18,comb1.combination13());
        assertEquals(22,comb2.combination13());
    }
    
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
