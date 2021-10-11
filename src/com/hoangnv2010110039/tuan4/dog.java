package com.hoangnv2010110039.tuan4;

public class dog {
    public String name;
    public int size;
    public String color;

    public dog(int s){
        size = s;

    }

    public dog(int s,String c, String n){
        size = s;
        color = c;
        name = n;
    }

    void inThongTin(){
        System.out.println("size = " + size + " " + "color = " + color + " " + "name = " + name);
    }

}

