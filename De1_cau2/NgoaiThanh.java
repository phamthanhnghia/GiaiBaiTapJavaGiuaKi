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
public class NgoaiThanh extends ChuyenXe{
    public String NoiDen;
    public int SoNgay;

    public NgoaiThanh() {
    }
    
    public NgoaiThanh(String NoiDen, int SoNgay, int MaChuyen, String HoTen, String SoXe, int KhoiLuong, int DoanhThu) {
        super(MaChuyen, HoTen, SoXe, KhoiLuong, DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgay = SoNgay;
    }
    @Override
    public void Input(){
        super.Input();
        System.out.println("NoiDen: ");
        this.NoiDen = in.nextLine();
        System.out.println("SoNgay: ");
        this.SoNgay = in.nextInt();
    }
    @Override
    public void Output(){
        super.Output();
        System.out.println("NoiDen: "+NoiDen);
        System.out.println("SoNgay: "+SoNgay);
    }
}
