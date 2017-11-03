/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_cau2;

/**
 *
 * @author nghia
 */
public class NoiThanh extends ChuyenXe{
    public int QuangDuong;

    public NoiThanh() {
    }

    public NoiThanh(int QuangDuong, int MaChuyen, String HoTen, String SoXe, int KhoiLuong, int DoanhThu) {
        super(MaChuyen, HoTen, SoXe, KhoiLuong, DoanhThu);
        this.QuangDuong = QuangDuong;
    }
   
    @Override
    public void Input(){
        super.Input();
        System.out.println("QuangDuong: ");
        this.QuangDuong = in.nextInt();
    }
    @Override
    public void Output(){
        super.Output();
        System.out.println("QuangDuong: "+QuangDuong);
    }
    
}
