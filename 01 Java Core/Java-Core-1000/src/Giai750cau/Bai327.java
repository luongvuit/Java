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
public class Bai327 {

    static int n, m, a[][], i, j;

    public static void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        n = scan.nextInt();
        System.out.println("Nhap so cot: ");
        m = scan.nextInt();
        a = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("   a[" + i + "," + j + "]=");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuat() {
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static int thuattoan() {
        int s = 0;
        for (j = 0; j < m; j++) {
            s += a[0][j];
            s += a[n - 1][j];
        }
        for (i = 1; i < n - 1; i++) {
            s += a[i][0];
            s += a[i][m - 1];
        }
        return s;
    }
    public static void main(String[] args) {
        nhap();
        xuat();
        int s = thuattoan();
        System.out.println("Tong cac gia tri nam tren bien bang: " + s);
    }
}
