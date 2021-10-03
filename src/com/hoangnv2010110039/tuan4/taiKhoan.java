package com.hoangnv2010110039.tuan4;

public class taiKhoan {
    String tentaikhoan;
    int sotaikhoan;
    float sodu;

    taiKhoan(){}

    taiKhoan(String tk, int stk, float sd){
        tentaikhoan = tk;
        sotaikhoan = stk;
        sodu = sd;

    }

    void intThongTinTaikhoan(){
        System.out.println("Tên tài khoản: " + tentaikhoan + " " + "Số tài khoản: " + sotaikhoan + " " + "Số dư trong tài khoản: " + sodu);
    }
}
