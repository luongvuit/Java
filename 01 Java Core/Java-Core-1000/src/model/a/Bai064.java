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
public class Bai064 {
public float baitap(float a,float b){
    float c = 0;
    if(a==0){
        if(b==0){
            System.out.println("Phuong trinh vo nghiem.");
    }
        else{
            c=-b;
        }
    }
    else{
        c=-b/a;
    }
    return c;
}

    public void tich64() {
        Bai064 bt = new Bai064();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = scan.nextFloat();
        System.out.print("Nhap b: ");
        float b = scan.nextFloat();
        System.out.println("Ket qua: " + bt.baitap(a, b));
    }
    
}
