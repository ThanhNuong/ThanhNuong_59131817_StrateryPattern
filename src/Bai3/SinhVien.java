/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Date;

public class SinhVien {
    //khai báo thuộc tính
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;

    
    public SinhVien() {
    }

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    public void hienThiTT(){
        System.out.println("Họ tên sinh viên: "+hoTen);
        System.out.println("Ngày sinh của sinh viên: "+ngaySinh);
        System.out.println("Diêm trung bình : "+diemTB);
    }
}
