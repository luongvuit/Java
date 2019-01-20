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
public class Bai443 {

    public static void nhap(int a[][], int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "," + j + "]=");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuat(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int thuattoan1(int a[][], int n) {
        int max1 = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                max1 = (a[i][j] > max1) ? a[i][j] : max1;
            }
        }
        return max1;
    }

    public static int thuattoan2(int a[][], int n) {
        int max2 = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                max2 = (a[i][j] > max2) ? a[i][j] : max2;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        nhap(a, n);
        System.out.println("Mang truoc: ");
        xuat(a, n);
        int max1 = thuattoan1(a, n);
        System.out.println("Max 1: " + max1);
        int max2 = thuattoan2(a, n);
        System.out.print("Max 2: " + max2);

    }
}
