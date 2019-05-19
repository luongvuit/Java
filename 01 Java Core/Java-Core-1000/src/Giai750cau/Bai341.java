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
public class Bai341 {

    static int n, m, a[][], i, j, x;

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
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int thuattoan() {
        int count = 0;
        for (j = 0; j < m; j++) {
            if (a[0][j] > 0 || a[n - 1][j] > 0) {
                count++;
            }
        }
        for (i = 0; i < n; i++) {
            if (a[i][0] > 0 || a[i][m - 1] > 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        nhap();
        xuat();
        int count = thuattoan();
        System.out.println("ket qua: " + count);
    }
}
