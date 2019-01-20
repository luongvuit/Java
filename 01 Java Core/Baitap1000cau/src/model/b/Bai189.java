/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.b;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai189 {

    public void tich189() {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int dv = 0;
        int i;
        for (i = 0; i < n; i++) {
            int t = a[i];
            dv = t / 10;
            t /= 10;
            if (dv % 2 == 1) {
                System.out.println("Cac gia tri la: " + a[i]);
            }
        }
    }
}