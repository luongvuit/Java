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
public class Bai722 {
     public static void nhap(int a[], int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = scan.nextInt();
        }
        System.out.println();
    }

    public static int tong(int a[], int n) {
        if (n == 0) {
            return 0;
        }
        return tong(a,n-1)+a[n-1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int a[] = new int[100];
        nhap(a, n);
        int tong = tong(a, n);
        System.out.print(tong);
    }
}
