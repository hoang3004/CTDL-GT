package com.hoangnv2010110039.tuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1Lap5 {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        arr = nhap();
        xuat(arr);
    }
    public static ArrayList<Double> nhap(){
        double x;
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập vào một con số: ");
            x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            
            System.out.print("Nhập thêm (Y/N) :  ");
            if(scanner.nextLine().equals("N")){
                break;
            }
        }
        return list;
    }
        public static void xuat (ArrayList<Double> listt){
            double tong = 0;
            System.out.println("Các phần tử của list: ");
            for (Double x  : listt) {
                System.out.println("Xuất phần tử trong list: "+ x);
                tong += x;
            }
            System.out.println("Tổng các phần tử của list: "+ tong);

        }

}
