/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_cau1;

/**
 *
 * @author nghia
 */
public class Xe {
    private String chu_xe;
    private String loai;
    private Double tri_gia;
    private int dung_tich;
    
    public Xe() {
    }

    public Xe(String chu_xe, String loai, int dung_tich) {
        this.chu_xe = chu_xe;
        this.loai = loai;
        this.dung_tich = dung_tich;
        this.tri_gia = Thue(dung_tich);
    }

    
    public static double Thue(int xilanh){
        if(xilanh < 100){
            return 0.01;
        }
        if(xilanh >= 100 && xilanh < 175){
            return 0.03;
        }else{
            return 0.05;
        }
    }
    
    public void Output(){
        System.out.println("Chu xe :"+chu_xe+" Loai : "+loai+" Dung tich: "+dung_tich+" Tri gia: "+tri_gia);
    }

}
