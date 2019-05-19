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
public class Bai215 {
    public void tich215() {
       Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int i;
        int s = 0;
        int y =0;
        for (i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
            s+= Math.abs(a[i]-a[i+1]);
            y++;
        }
        }
        int t = s/y;
        System.out.println("Ket qua: " + t);
    }

}


