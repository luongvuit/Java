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
public class Bai438 {

    public static void nhap(int a[][], int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "," + j + "]=");
                a[i][j]=scan.nextInt();
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
        int tong1 = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                tong1 += a[i][j];
            }
        }
        return tong1;
    }

    public static int thuattoan2(int a[][], int n) {
        int tong2 = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                tong2 += a[i][j];
            }
        }
        return tong2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        nhap(a, n);
        System.out.println("Mang truoc: ");
        xuat(a, n);
        int tong1 = thuattoan1(a, n);
        System.out.println("Tong 1: " + tong1);
        int tong2 = thuattoan2(a, n);
        System.out.print("Tong 2: " + tong2);

    }
}
