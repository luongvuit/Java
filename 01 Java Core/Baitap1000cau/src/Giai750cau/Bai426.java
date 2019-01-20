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
public class Bai426 {

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

    public static void sapxep(int a[][], int n, int m, int b[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = Math.abs(a[i][j]);
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
        int b[][] = new int[n][m];
        nhap(a, n, m);
        System.out.println("Mang truoc khi sap xep: ");
        xuat(a, n, m);
        System.out.println("Mang sau khi sap xep: ");       
        sapxep(a, n, m, b);
        xuat(b,n,m);
    }
}
