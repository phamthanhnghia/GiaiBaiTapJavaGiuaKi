/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_cau2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nghia
 */
public class main {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<ChuyenXe> arr = new ArrayList<>();
        // cau 1 Viết hàm nhập xuất danh sách các chuyến xe không quá 20 chuyến cho cả chuyến nội thành và ngoại thành.
        NhapDanhSach(arr);
        // cau 2 Tính tổng doanh thu của chuyến nội thành và ngoại thành.
        DoanhThu(arr);
        // cau 3 In ra thông tin chuyến xe có doanh thu cao nhất của từng loại chuyến.
        ChuyenXeDoanhThuCaoNhat(arr);
    }
    static void NhapDanhSach(ArrayList<ChuyenXe> arr){

        int i=0, a;
        while(i<20){
            System.out.println("1: NoiThanh , 2: NgoaiThanh, 3: Thoat");
            a = in.nextInt();
            if(a== 1){
                ChuyenXe exam = new NoiThanh();
                exam.Input();
                arr.add(exam);
                i++;
            }
            if(a==2){
                ChuyenXe exam = new NgoaiThanh();
                exam.Input();
                arr.add(exam);
                i++;
            }
            if(a!=1 && a!=2){
                break;
            }     
        }
    }
    static void DoanhThu(ArrayList<ChuyenXe> arr){
        int sum=0;
        for(int j=0;j<arr.size();j++){
            sum = sum + arr.get(j).DoanhThu;
        }
        System.out.println("Tong DoanhThu"+sum);
    }
    static void ChuyenXeDoanhThuCaoNhat(ArrayList<ChuyenXe> arr){
        int a = 0; // lưu trữ vị trí chuyến xe ngoại thành có doanh thu cao nhất
        int b = 0; // lưu trữ vị trí chuyến xe noi thành có doanh thu cao nhất
        int max_a = 0; // dùng để so sánh cho ngoại thành
        int max_b =0;// dùng để so sánh cho nội thành
        for(int i =0 ; i<arr.size();i++){
            if(arr.get(i) instanceof NgoaiThanh){ // kiem tra lop ngoại thành
                if(arr.get(i).DoanhThu > max_a){
                    max_a= arr.get(i).DoanhThu;
                    a = i;
                }
            }
            if(arr.get(i) instanceof NoiThanh){ 
                if(arr.get(i).DoanhThu > max_b){
                    max_b= arr.get(i).DoanhThu;
                    b = i;
                }
            }
        }
        NoiThanh noi = (NoiThanh)arr.get(a);
        NgoaiThanh ngoai = (NgoaiThanh)arr.get(b);
        System.out.println("Chuyến xe ngoại thành có doanh thu cao nhât là : ");
        noi.Output();
        System.out.println("Chuyến xe nội thành có doanh thu cao nhât là : ");
        ngoai.Output();

    }
}
