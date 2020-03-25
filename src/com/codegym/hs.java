package com.codegym;

public class hs {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    hs(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "codegym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
