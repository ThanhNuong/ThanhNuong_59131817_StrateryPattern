/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class MainBai2 {

    public static void main(String[] args) {
        //khai báo hàng hóa
        HangHoa hh1 = new HangHoa("Quần jean nữ", 350000, "Dành cho nữ");
        HangHoa hh2 = new HangHoa("Quần jean nam", 300000, "Dành cho nam");
        HangHoa hh3 = new HangHoa("Đầm dự tiệc", 400000, "Dành cho nữ đi tiệc, form ôm người");
        HangHoa hh4 = new HangHoa("Áo thun form rộng dài tay", 100000, "Dành cho nam nữ");
        HangHoa hh5 = new HangHoa("Quần tây đen", 100000, "Dành cho nam");
        //khai báo gio hang
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
        
        gh1.themHHvaoGH(hh1);
        gh1.themHHvaoGH(hh2);
        gh1.themHHvaoGH(hh5);
        
        gh2.themHHvaoGH(hh2);
        gh2.themHHvaoGH(hh3);
        gh2.themHHvaoGH(hh4);
               
        IThanhToan ttOnline = new ThanhToanOnline();
        gh1.setHinhThucTT(ttOnline);
        System.out.println("\nThông tin Danh sách giỏ hàng thanh toán Online ");
        gh1.hienThiDS();
        System.out.println("Tiền hàng : "+gh1.tongTien());
        System.out.println("Số tiền khach phải trả : "+gh1.thanhToan((int)gh1.tongTien()));
        
        IThanhToan ttCOD = new ThanhToanCOD();
        gh2.setHinhThucTT(ttCOD);
        System.out.println("\nThông tin Danh sách giỏ hàng thanh toán COD");
        gh2.hienThiDS();
        System.out.println("Tiền hàng : "+gh2.tongTien());
        System.out.println("Số tiền khach phải trả : "+gh2.thanhToan((int)gh2.tongTien()));
        
    }
    
}
