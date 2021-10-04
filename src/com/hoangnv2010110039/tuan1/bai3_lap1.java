package com.hoangnv2010110039.tuan1;
import java.util.Scanner;
public class bai3_lap1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cạnh khối lập phương:");
        double canh = scanner.nextDouble();
        double theTich = canh * canh * canh;
        System.out.println("Thể tích khối lập phương là: " + theTich);
    }
}
