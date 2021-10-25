package com.hoangnv2010110039.kiemtragiuaki;

import java.util.Scanner;
import java.util.ArrayList;

public class taoTestDrive 
{
    static tao Tao;
    static ArrayList<tao> dsTao = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static void NhapThongTin() 
    {
        

        String break_out;

        while (true) {
            Tao = new tao();

            System.out.print("Mã số quả táo: ");
            Tao.maSo = input.nextInt();

            System.out.print("Màu sâc quả táo: ");
            Tao.mauSac = input.nextLine();

            System.out.print("Khối lượng quả táo: ");
            Tao.khoiLuong = input.nextDouble();
            input.nextLine();

            System.out.println("Bấm Y để huỷ, bấm bất kỳ để tiếp tục.");
            
            dsTao.add(Tao);

            break_out = input.nextLine();
            if (break_out.equalsIgnoreCase("Y")) 
            {
                break;
            }

        }


    }
    
    
    static void inThongTinTao(){
        for(tao quaTao : dsTao) 
        {
            System.out.println("khối lượng của táo: " + quaTao.khoiLuong);
            System.out.println("mã số của của táo: " + quaTao.maSo);
            System.out.println("màu sắc của táo: " + quaTao.mauSac);
        }
    }
    

    static void TimTheoMau(String timtheomau) {
        for(tao i : dsTao) {
            if (i.mauSac.equals(timtheomau)) {
                System.out.println("ID " + i.maSo + " Khối lượng " + i.khoiLuong + " Màu sắc " + i.mauSac);
            }
        }
    }


    public static void main(String[] args) {
        Integer select;
        do {
            System.out.println("_______TUỲ CHỌN_______");
            System.out.println("1. Nhập táo");
            System.out.println("2. Tìm táo");
            System.out.println("3. In táo");

            select = input.nextInt();
            input.nextLine();

            switch(select) {
                case 1: {
                    NhapThongTin();
                    break;
                }
                case 2: {
                    System.out.print("màu sắc: ");
                    String mauCanTim;

                    mauCanTim = input.nextLine();
                    TimTheoMau(mauCanTim);
                    break;
                }
                case 3: {

                    break;
                }
            }

        } while (select >= 1 && select <= 5);
    }
}
