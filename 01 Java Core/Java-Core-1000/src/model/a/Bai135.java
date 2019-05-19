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
public class Bai135 {
    int baitap(int a[],int n){
        int i;
        for (i = 0; i < n; i++) {
            if(a[i]>0){
                return a[i];
            }
        }
        return -1;
    }
    public void tich135() {
        Bai135 bt = new Bai135();
        int a[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu:");
        int n = sc.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Ket qua: " + bt.baitap(a, n));
    }
    
}
