package com.hoangnv2010110039.tuan1;
import java.util.Scanner;
public class bai1_lap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String hovaten = scanner.nextLine();
        System.out.print("Diem trung binh: ");
        Double diemTb = scanner.nextDouble();
        System.out.printf("%s: %.2f diem",hovaten, diemTb); 
    }
}
