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
public class Bai136 {
    int baitap(int a[],int n){
        int i;
        for ( i = n-1; i >= 0; i--) {
            if(a[i]%2==0){
                return a[i];
            }
        }
        return -1;
    }
    public void tich136() {
        Bai136 bt = new Bai136();
        int a[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        System.out.println("Ket qua: " + bt.baitap(a, n));
    }
    
}
