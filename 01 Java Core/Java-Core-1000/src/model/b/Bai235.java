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
public class Bai235 {

    public void tich235() {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        int b[] = new int[100];
        System.out.print("Nhap so phan tu cua mang a: ");
        int n = scan.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " cua mang a : ");
            a[i] = scan.nextInt();
        }
        System.out.print("Nhap so phan tu cua mang b: ");
        int m = scan.nextInt();
        for (i = 0; i < m; i++) {
            System.out.print("Nhap phan tu thu " + i + " cua mang b : ");
            b[i] = scan.nextInt();
        }
        int test;
        for (i = 0; i < n; i++) {
            test = 1;
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    test = 0;
                    break;
                }
            }
            if (test == 1) {
                System.out.println(a[i]);
                
            }
        }
        for (int j = 0; j < m; j++) {
            test = 1;
            for (i = 0; i < n; i++) {
                if (b[j] == a[i]) {
                    test = 0;
                    break;
                }
            }
            if (test == 1) {
                System.out.println(b[j]);
                
            }
        }

    }
}
