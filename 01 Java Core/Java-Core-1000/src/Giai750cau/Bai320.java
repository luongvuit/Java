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
public class Bai320 {

    static int n, m, a[][], i, j;

    public static void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        n = scan.nextInt();
        System.out.print("Nhap so cot: ");
        m = scan.nextInt();
        a = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("  a[" + i + "," + j + "]=");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuat() {
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }

    int thuattoan() {
        int s = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (a[i][j] > 0) {
                    s += a[i][j];
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        nhap();
        xuat();
        Bai320 bt = new Bai320();
        System.out.print("Tong la: " + bt.thuattoan());
    }
}
