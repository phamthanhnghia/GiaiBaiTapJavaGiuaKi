/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_cau1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nghia
 */
public class main {

    // khai bao bien cho toan chuong trinh
    static Scanner in = new Scanner(System.in);
    static String chu,loai;
    static int dung_tich;
    public static void main(String[] args) {
        ArrayList<Xe> arr = new ArrayList<>();
        // cau a Nhập danh sách xe vào một Array List, việc nhập kết thúc khi ta nhập tên chủ xe bằng rỗng.
        NhapDanhSach(arr);
        // cau b Xuất bảng kê khai tiền thuế phải đóng của các xe trong danh sách. Thông tin xuất bao
        // gồm: tên chủ xe, loại xe, trị giá xe, dung tích xylanh của xe, thuế phải đóng.
        XuatDanhSach(arr);
        // cau c Nhập tên chủ xe và loại xe vào, xuất hiện thuế phải đóng của chủ xe.
        NhapDanhSachXuatThue(arr);
    }
    static void NhapDanhSach(ArrayList<Xe> arr){ // cau a
        
        while(true){
            System.out.println("chu xe : ");
            chu = in.nextLine();
            System.out.println("Loai : ");
            loai = in.nextLine();
            System.out.println("Dung tich : ");
            dung_tich = in.nextInt();
            if(chu == null){
                break;
            }else{
                Xe X = new Xe(chu, loai, dung_tich);
                arr.add(X);
            }
        }
    }
    
    static void XuatDanhSach(ArrayList<Xe> arr){ // cau b
        for(int i=0;i<arr.size();i++){
            arr.get(i).Output();
        }
    }
    
    static void NhapDanhSachXuatThue(ArrayList<Xe> arr){ // cau c
        
        while(true){
            System.out.print("chu xe : ");
            chu = in.nextLine();
            System.out.print("Loai : ");
            loai = in.nextLine();
            System.out.print("Dung tich : ");
            dung_tich = in.nextInt();
            System.out.print("Dung tich : "+ Xe.Thue(dung_tich));
            dung_tich = in.nextInt();
            if(chu == null){
                break;
            }else{
                Xe X = new Xe(chu, loai, dung_tich);
                arr.add(X);
            }
        }
    }
}
