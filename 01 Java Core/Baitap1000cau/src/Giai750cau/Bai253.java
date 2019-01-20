/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giai750cau;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai253 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        int b[] = new int[100];
        System.out.print("Nhap so phan tu cua mang a: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        System.out.print("Nhap so phan tu cua mang b: ");
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            b[i] = scan.nextInt();
        }
        int flag = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    dem++;
                }
            }
        }
        if (dem == n) {
            flag = 1;
        } else {
            flag = 0;
        }
        System.out.println(flag);
    }
}
