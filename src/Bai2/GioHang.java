/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;

public class GioHang implements IThanhToan{
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHH = new ArrayList<>();

    public GioHang() {
    }
           
    //phương thức constructor có tham số
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    //ghii đề phương thức thanhToan để tính tiền hàng hóa
    @Override
    public double thanhToan(int tienHang) {
        return hinhThucTT.thanhToan(tienHang);
    }
    
    //Phương thức tính tổng tiền trong giỏ hàng
    public double tongTien(){
        double tong=0;
        for(int i=0; i<dsHH.size(); i++){
            tong += dsHH.get(i).getGia();
        }return tong;            
    }
    
    //phương thức hiển thị thông tin tất cả các hàng hóa trong gio hàng
    public void hienThiDS(){
        for(int i=0; i<dsHH.size(); i++){
            dsHH.get(i).xuat();
        }
    }
    
    //phương thức thêm hàng hóa vào giỏ hàng
    public void themHHvaoGH(HangHoa hh){
        dsHH.add(hh);
    }

}
