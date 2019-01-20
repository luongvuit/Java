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
public class Bai322 {

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
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }

    static int thuattoan() {
        int s = 0;
        for (j = 0; j < m; j++) {
            s += a[x][j];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nhap();
        xuat();
        System.out.println("Nhap dong can tinh: ");
        x = scan.nextInt();
        int s = thuattoan(); // neu k su dung cach nay thi tao doi tuong bt roi goi toi 
        System.out.println("Ket qua: " + s);
    }
}
