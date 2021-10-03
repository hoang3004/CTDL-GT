package com.hoangnv2010110039.tuan4;

import java.util.Scanner;

public class taiKhoanTestDrive {
    public static void main(String[] args) {
        taiKhoan[] taikhoanlist = new taiKhoan[2];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < taikhoanlist.length; i++ ){
            System.out.println("nhập tài khoản thứ  " + (i + 1));
            System.out.print("Tên tài khoản: ");
            String tk = bienNhap.nextLine();
            System.out.print("Số tài khoản: ");
            int stk = bienNhap.nextInt();
            System.out.print("Số dư trong tài khoản: ");
            float sd = bienNhap.nextFloat();
            bienNhap.nextLine();
            taikhoanlist[i] = new taiKhoan(tk, stk, sd);

        }

        System.out.println("_____THÔNG TIN TÀI KHOẢN_____");
        for(taiKhoan taikhoan : taikhoanlist){
            taikhoan.intThongTinTaikhoan();
        }

    }
}
