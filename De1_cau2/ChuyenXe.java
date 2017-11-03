/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_cau2;

import java.util.Scanner;

/**
 *
 * @author nghia
 */
public class ChuyenXe {
    public int MaChuyen;
    public String HoTen;
    public String SoXe;
    public int KhoiLuong;
    public int DoanhThu;
    public Scanner in = new Scanner(System.in);
    
    public ChuyenXe() {
    }
    
    public ChuyenXe(int MaChuyen, String HoTen, String SoXe, int KhoiLuong, int DoanhThu) {
        this.MaChuyen = MaChuyen;
        this.HoTen = HoTen;
        this.SoXe = SoXe;
        this.KhoiLuong = KhoiLuong;
        this.DoanhThu = DoanhThu;
    }
    public void Input(){
        System.out.println("MaChuyen: ");
        this.MaChuyen = in.nextInt();
        System.out.println("HoTen: ");
        this.HoTen = in.nextLine();
        System.out.println("SoXe: ");
        this.SoXe = in.nextLine();
        System.out.println("KhoiLuong: ");
        this.KhoiLuong = in.nextInt();
        System.out.println("DoanhThu: ");
        this.DoanhThu = in.nextInt();
    }   
    public void Output(){
        System.out.println("MaChuyen: "+MaChuyen);
        System.out.println("HoTen: "+HoTen);
        System.out.println("SoXe: "+SoXe);
        System.out.println("KhoiLuong: "+KhoiLuong);
        System.out.println("DoanhThu: "+DoanhThu);
        
    }
}
