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
public class Bai724 {
     public static void nhap(int a[], int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = scan.nextInt();
        }
        System.out.println();
    }

    public static int tich(int a[], int n) {
        if (n<1) {
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(a[n-1]>a[n-2]){
            return tich(a,n-1)*a[n-1];
        }
        return tich(a,n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int a[] = new int[100];
        nhap(a, n);
        int tich = tich(a, n);
        System.out.print(tich);
    }
}
