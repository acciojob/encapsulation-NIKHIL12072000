package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly obj=new RWOnly();
        //obj.name;
        // System.out.println(obj.name);
        obj.setName("Nikhil");
        obj.getName();
    }
}