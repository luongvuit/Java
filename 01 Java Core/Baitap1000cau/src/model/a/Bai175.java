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
public class Bai175 {

    public void tich175() {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int i,j;
        int min  = Math.abs(a[0]-a[1]);
        for (i = 0; i < n; i++) {
            for (j = i+1; j < n-1; j++) {
                if(Math.abs(a[i]-a[j])<min){
                    min = Math.abs(a[i]-a[j]);
                    System.out.println("Hai gia tri gan nhau nhat: " + a[i] + " va " + a[j]);
                }
            }
        }
    }
    
}
