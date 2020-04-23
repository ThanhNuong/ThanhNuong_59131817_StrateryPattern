/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

public class HangHoa {
    //khai báo thuộc tính
    private String tenHH ;
    private int gia;
    private String moTa;

    //phương thức constructor không tham số
    public HangHoa() {
    }

    //phương thức constructor có tham số
    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    //phương thức get
    public String getTenHH() {
        return tenHH;
    }

    public int getGia() {
        return gia;
    }

    public String getMoTa() {
        return moTa;
    }

    //phương thức set
    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    //phương thức xuất thông tin của mặt hàng
    public void xuat(){
        System.out.println("Ten hang hoa: "+tenHH);
        System.out.println("Gia hang hoa: "+gia);
        System.out.println("Mo ta hang hoa: "+moTa);
    }
}
