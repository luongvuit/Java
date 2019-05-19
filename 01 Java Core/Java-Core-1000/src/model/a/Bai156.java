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
public class Bai156 {
    int baitap(int a[], int b[],int n){
        int i;
        int x = 0;
        for (i = 0; i < n; i++) {
            b[i] = (Math.abs(x-a[i]));
        }
        int min = b[0];
        for ( i = 0; i < n; i++) {
            if(b[i]<min){
                min = b[i];
            }
        }
        int vtnn = 0;
        for (i = 0; i < n; i++) {
            if(b[i]==min){
                vtnn=i;
            }
        }
        return vtnn;
    }
    public void tich156() {
        int a[] = new int[100];
        int b[] = new int[100];
        Bai156 bt = new Bai156();
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
