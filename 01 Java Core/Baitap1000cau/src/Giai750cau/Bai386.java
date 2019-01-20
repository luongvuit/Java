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
public class Bai386 {

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

    public static void lietke(int a[][], int n, int m) {
        int b[] = new int[100];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i] += a[j][i];
            }
        }
        int min = b[0];
        for (int i = 1; i < m; i++) {
            min = (min < b[i]) ? min : b[i];
        }
        for (int i = 0; i < m; i++) {
            if (min == b[i]) {
                System.out.println("Cot " + i + " co tong phan tu la " + min);
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
        lietke(a, n, m);
    }
}
