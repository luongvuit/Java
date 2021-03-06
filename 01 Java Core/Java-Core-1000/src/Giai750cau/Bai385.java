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
public class Bai385 {

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
                System.out.print(a[i][j] + "   ");
            }
        System.out.println();
        }
    }
    public static void lietke(int a[][], int n, int m) {
        int b[] = new int[100];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            b[j] += a[i][j]; // cai gi thay doi thi de cai do trong b
        }
        }
        int max = b[0];
        for (int i = 1; i < n; i++) {
            max = (max > b[i]) ? max : b[i];
        }
        for (int i = 0; i < n; i++) {
            if (b[i] == max) {
                System.out.println("Dong " + i + " co tong phan tu la " + max);
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
