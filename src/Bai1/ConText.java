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
public class ConText {
    ITinh thuchien;

    public ConText() {
    }

    public void setThuchien(ITinh thuchien) {
        this.thuchien = thuchien;
    }
   
    public double tinh(double a, double b){
        return thuchien.tinh(a, b);
    }
}
