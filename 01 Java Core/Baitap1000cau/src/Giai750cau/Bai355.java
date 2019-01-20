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
public class Bai355 {

    static int n, m, a[][], i, j, b[];

    public static void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so hang: ");
        n = input.nextInt();
        System.out.print("nhap so cot: ");
        m = input.nextInt();
        a = new int[n][m];
        b = new int[100];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("  a[" + i + "," + j + "]=");
                a[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuat() {
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    static void thuattoan() {
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (a[i][j] < 0) {
                    System.out.println(i);
                    if (a[i][j] != a[i][j] && i == i) {
                        System.out.println(i);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        nhap();
        xuat();
        thuattoan();
    }
}
