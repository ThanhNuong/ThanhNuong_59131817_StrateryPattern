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
public class ThanhToanOnline implements IThanhToan{
    //ghi đè phuowg thức thanhToan để tính tổng tiền khách hàng phải trả
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
            return tienHang * 0.95;
        else
            return tienHang * 0.93;
    }
}
