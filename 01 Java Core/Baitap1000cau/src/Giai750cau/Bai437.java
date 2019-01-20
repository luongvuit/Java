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
public class Bai437 {

    public static void nhap(int a[][], int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "," + j + "]=");
                a[i][j]= scan.nextInt();
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

    public static void thuattoan1(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i][j] > a[i][k]) {
                        int temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
        }
    }

    public static void thuattoan2(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[j][i] > a[k][i]) {
                        int temp = a[j][i];
                        a[j][i] = a[k][i];
                        a[k][i] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        nhap(a, n);
        System.out.println("Mang truoc: ");
        xuat(a, n);
        System.out.println("Mang sau: ");
        thuattoan1(a, n);
        thuattoan2(a, n);
        xuat(a, n);
    }
}
