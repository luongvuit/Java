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
public class Bai378 {

    public static void nhap(int[][] a, int n, int m) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("  a[" + i + "," + j + "]=");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuat(int[][] a, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void tachchuso(int n, int[] b) {
        int chuso;
        do {
            n = Math.abs(n);
            chuso = n % 10;
            b[chuso]++;
            n /= 10;
        } while (n > 0);
    }

    public static int timchusonhieunhat(int a[][], int n, int m) {
        int b[] = new int[10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tachchuso(a[i][j], b);
            }
        }
        int chusomax = 0;
        for (int i = 0; i < 10; i++) {
            if (b[chusomax] < b[i]) {
                chusomax = i;
            }
        }
        return chusomax;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so hang: ");
        int n = scan.nextInt();
        System.out.print("nhap so cot: ");
        int m = scan.nextInt();
        int a[][] = new int[n][m];
        nhap(a, n, m);
        xuat(a, n, m);
        int chusomax = timchusonhieunhat(a, n, m);
        System.out.print("Chu so xuat hien nhieu nhat: " + chusomax);
    }
}
