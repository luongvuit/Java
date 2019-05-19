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
public class Bai352 {

    static int n, m, a[][], i, j, x, k;

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
        int flag = 1;
        for (j = 0; j < m - 1; j++) {
            for (k = j + 1; k < m; k++) {
                if (a[x][j] > a[x][k]) {
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nhap();
        xuat();
        System.out.print("Nhap hang can kiem tra: ");
        x = scan.nextInt();
        int flag = thuattoan();
        if (flag == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
