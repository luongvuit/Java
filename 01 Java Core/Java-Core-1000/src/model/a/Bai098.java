/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.a;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai098 {
    
public int baitap(int a,int b,int c,int d, int e, int f, int x, int y){
    int q = 0, m = -1;
    int D = a*e-d*b;
    int Dx= c*e-f*b;
    int Dy=a*f-d*c;
    int songhiem = 0;
    if(D!=0){
       x = Dx/D;
       y = Dy/D;
        System.out.println("He phuong trinh co 1 nghiem duy nhat: " + x + " va " + y);
        songhiem = 1;
    }
    else{
        if(Dx!=0 || Dy!=0){  // || là hoặc
            System.out.println("He phuong trinh vo nghiem");
            songhiem = q;
        }
        else {
            System.out.println("He phuong trinh vo so nghiem");
            songhiem = m;
        }
    }
    return songhiem;
}
    public void tich98() {
        Bai098 bt = new Bai098();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a:");
        int a = scan.nextInt();
        System.out.print("Nhap b:");
        int b = scan.nextInt();
        System.out.print("Nhap c:");
        int c = scan.nextInt();
        System.out.print("Nhap d:");
        int d = scan.nextInt();
        System.out.print("Nhap e:");
        int e = scan.nextInt();
        System.out.print("Nhap f:");
        int f = scan.nextInt();
        System.out.println(bt.baitap(a, b, c, d, e, f, f, f));
    }
    
}
