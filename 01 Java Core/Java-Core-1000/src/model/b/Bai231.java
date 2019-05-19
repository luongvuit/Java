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
public class Bai231 {

    public void tich231() {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }

        for (i = 0; i < n; i++) {
            int dem = 0;
            for (j = 0; j < n; j++) {
                if (a[i] == a[j] && i != j) {
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.println(a[i]);
            }
        }

    }
}
