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
public class Bai037 {
    public float baitap(int n){
    float S=0;
    if(n<2){
            System.out.println("Nhap n khong hop le.");
}
    else{
        for (int i = 2; i <= n; i++) {
            S = (float) Math.pow((i+S)*1.0, 1.0/i);
        }
    }
    return S;
    }
    public void tich37() {
        Bai037 bt = new Bai037();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Ket qua: " + bt.baitap(n));
    }
    
}
