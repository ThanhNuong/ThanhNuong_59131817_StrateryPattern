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
public class Chia implements ITinh{

    @Override
    public double tinh(double a, double b) {
        if(b==0){
              System.out.println("Mẫu phải khác 0! Không thực hiện phét tính được.");
              return 0;
          }
          else 
              return b/a;
    }
    
}
