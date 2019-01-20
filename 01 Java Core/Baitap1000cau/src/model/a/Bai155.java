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
public class Bai155 {
int baitap(int a[],int b[],int n){
    int i,x = 0;
    int max = b[0];
    int t = 0;
    for (i = 0; i < n; i++) {
        b[i] = (Math.abs(x-a[i]));
    }
    for (i = 0; i < n; i++) {
        if(b[i]>max){
            max = b[i];
        }
    }
    for (i = 0; i < n; i++) {
        if(b[i]==max){
            return a[i];
        }
    }
    return a[i];
}
    public void tich155() {
        int a[] = new int[100];
        int b[] = new int[100];
        Bai155 bt = new Bai155();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        System.out.print("Nhap x: ");
        int x = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        System.out.println("Ket qua: " + bt.baitap(a, b, n));
    }
    
}
