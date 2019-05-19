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
public class Bai393 {

    public static void nhap(int a[][], int n, int m) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "," + j + "]=");
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

    public static void hoanvihaicot(int a[][], int n, int m, int c1, int c2) {
        if ((c1 >= 0 && c1 < m) && (c2 >= 0 && c2 < m)) {
            int temp;
            for (int i = 0; i < n; i++) {
                temp = a[i][c1];
                a[i][c1] = a[i][c2];
                a[i][c2] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so cot: ");
        int n = scan.nextInt();
        System.out.print("Nhap so dong: ");
        int m = scan.nextInt();
        int a[][] = new int[n][m];
        nhap(a, n, m);
        xuat(a, n, m);
        System.out.print("Nhap cot 1: ");
        int c1 = scan.nextInt();
        System.out.print("Nhap cot 2: ");
        int c2 = scan.nextInt();
        hoanvihaicot(a, n, m, c1, c2);
        xuat(a, n, m);
    }
}
