/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter no of checks: ");
         int check = sc.nextInt();
        Bnkfees(check);
    }
    public static void Bnkfees(int checks){
double checksfee=0;
double Charge=0;
double basefee= 10;
  if(checks < 20){
   checksfee= 0.10;
}else if(checks >= 20 && checks < 40){
   checksfee = 0.08;
}else if (checks >= 40 && checks < 60) {
      checksfee = 0.06;
    } else {
      checksfee = 0.04;
    }
   Charge = basefee + (checksfee * checks);
 System.out.println(Charge);
}

}

