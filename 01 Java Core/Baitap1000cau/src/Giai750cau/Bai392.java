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
public class Bai392 {

    public static void nhap(int a[][], int n, int m) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" a[" + i + "," + j + "]=");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuat(int a[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void hoanvihaidong(int a[][], int n, int m, int dong1, int dong2) {
        if ((dong1 >= 0 && dong1 < n) && (dong2 >= 0 && dong2 < n)) {
            int temp;
            for (int j = 0; j < m; j++) {
                temp = a[dong1][j];
                a[dong1][j] = a[dong2][j];
                a[dong2][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        int n = scan.nextInt();
        System.out.print("Nhap so cot: ");
        int m = scan.nextInt();
        int a[][] = new int[n][m];
        nhap(a, n, m);
        xuat(a, n, m);
        System.out.print("Nhap dong 1: ");
        int dong1 = scan.nextInt();
        System.out.print("Nhap dong 2: ");
        int dong2 = scan.nextInt();
        hoanvihaidong(a, n, m, dong1, dong2);
        xuat(a, n, m);
    }
}
