/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai063 {
    public float baitap(float a, float b){
        float p = a*b;
        float c;  // c = BCNN cua 2 so = tich  2 so do / UCLN
        while(a!=b){
            if(a>=b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        c = p/a;
        return c;
    }
    public void tich63() {
        Bai063 bt = new Bai063();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = scan.nextFloat();
        System.out.print("Nhap b: ");
        float b = scan.nextFloat();
        System.out.println("Ket qua: " + bt.baitap(a, b));
    }
    
}
