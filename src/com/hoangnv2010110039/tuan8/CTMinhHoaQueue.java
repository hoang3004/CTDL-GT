package com.hoangnv2010110039.tuan8;

import java.util.LinkedList;
import java.util.Queue;

public class CTMinhHoaQueue {
    public static void main(String[] args) {
        
        Queue<Integer> queue;

        queue = new LinkedList<>();
        
        queue.add(30);
        queue.add(4);
        queue.add(20);

        System.out.println(queue);

        //lấy ra 1 phần tử trong queue lấy đầu
        int phanTuDuocLayRa = queue.remove();
        System.out.println("phần tử được lấy ra từ queue: " + phanTuDuocLayRa);
        System.out.println("phần tử còn lại trong queue" + queue);
        int phanDuocTham = queue.peek();
        System.out.println("phần tử được thăm:  " + phanDuocTham);
        System.out.println("phần tử còn lại sau khi thăm ");
        System.out.print(queue);
        
        
        //dung linked List de cai dat cau truc Stack
        //cài đặt linked List
            //thêm 1 phần tử vào cuối
            //lấy phần tử cuối
            //xóa 1 phần tử ở cuối

    }
}
