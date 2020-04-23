/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class MainBai3 {

    public static void main(String[] args) throws ParseException {
        QLSV qldsSV = new  QLSV();
        
        //Phương thức SimpleDateFormat.parse(String string): được dụng để phân tích string thành date trong java.
        SinhVien sv1 = new SinhVien("Bùi Thị Thanh Nương", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1999"), 6);
        SinhVien sv2 = new SinhVien("Lê Thị Mộng Ngân", new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1999"), 8); 
        SinhVien sv3 = new SinhVien("Nguyễn Thị Mộng", new SimpleDateFormat("dd/MM/yyyy").parse("20/10/1998"), 5);
        
        qldsSV.themSV(sv3);
        qldsSV.themSV(sv2);
        qldsSV.themSV(sv1);
        
        System.out.println("Danh sách sinh viên trước khi sắp xếp");
        qldsSV.inDS();
        
        ISoSanh theoten = new SoSanhTheoTen();
        ISoSanh theodiem = new SoSanhTheoDiem();
        
        qldsSV.setSosanh(theoten);
        qldsSV.setSosanh(theodiem);
        
        System.out.println("\nDanh sách sinh viên sắp xếp theo ten");
        qldsSV.sapXep();
        qldsSV.inDS();
        
        System.out.println("\nDanh sách sinh viên sắp xếp theo diem");
        qldsSV.sapXep();
        qldsSV.inDS();
    }
    
}
