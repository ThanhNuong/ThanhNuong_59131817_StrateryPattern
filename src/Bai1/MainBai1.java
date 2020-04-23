/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class MainBai1 {

    public static void main(String[] args) {
        ConText tinh1 = new ConText();
      ITinh cong = new Cong();
      tinh1.setThuchien(cong);
        System.out.println("75 +12 = "+ tinh1.tinh(75, 12));
        
        ConText tinh2 = new ConText();
        ITinh tru = new Tru();
        tinh2.setThuchien(tru);
        System.out.println("54 - 78 = "+ tinh2.tinh(54, 78));
       
    }
    
    
}
