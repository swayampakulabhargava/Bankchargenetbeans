/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class mainTest {
    
    public mainTest() {
    }

   

    @Test
    public void testBnkfeeslessthan20() {
        System.out.println("Bnkfees");
        int checks = 19;
        main.Bnkfees(checks);
       
    }
     @Test
    public void testBnkfeesgreaterthanequals20andlessthan40() {
        System.out.println("Bnkfees");
        int checks = 25;
        main.Bnkfees(checks);
       
    }
      @Test
    public void testBnkfeesgreaterthanequals40andlessthan60() {
        System.out.println("Bnkfees");
        int checks = 55;
        main.Bnkfees(checks);
       
    }
      @Test
    public void testBnkfeesgreaterthan60() {
        System.out.println("Bnkfees");
        int checks = 75;
        main.Bnkfees(checks);
       
    }
    
}
