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
public class Bai040 {
public float baitap(int n,int x){
    float S=0;
    if(x<0){
        System.out.println("Nhap x khong hop le");
    }
    else {
    if(n<1) {
        System.out.println("Nhap n khong hop le ");
    }
    else {
        for (int i = 1; i <= n; i++) {
            S = (float) Math.sqrt(S+Math.pow(x*1.0, i*1.0));
        }
    }
    }
    return S;
}
    public void tich40() {
        Bai040 bt = new Bai040();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        System.out.println("Nhap x: ");
        int n = scan.nextInt();
        int x = scan.nextInt();
        System.out.println("Ket qua: " + bt.baitap(n, x));
    }
    
}
