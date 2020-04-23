/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Admin
 */
public class QLSV {
    ISoSanh<SinhVien>  sosanh;
    ArrayList<SinhVien> dssv = new ArrayList<>();

    public QLSV() {
    }

    public QLSV(ISoSanh<SinhVien> sosanh) {
        this.sosanh = sosanh;
    }

    public void setSosanh(ISoSanh<SinhVien> sosanh) {
        this.sosanh = sosanh;
    }
    
    //phương thức sắp xếp
    public void sapXep(){
        for(int i=0; i<dssv.size()-1; i++){
            for(int j=i+1; j<dssv.size(); j++){
                if(sosanh.soSanh(dssv.get(i), dssv.get(j)) > 0)
                    Collections.swap(dssv, i, j); //hoán đổi các yếu tố tại các vị trí được chỉ định trong danh sách nhất định
            }
        }
}       
    
    //phương thức inDS sinh viên
    public void inDS(){
        for(int i=0; i<dssv.size(); i++){
            dssv.get(i).hienThiTT();
        }
    }
    
    //phương thức thêm sinh viên vào danh sách
    public void themSV(SinhVien sv){
            dssv.add(sv);
    }
    
}
