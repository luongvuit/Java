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
public class Bai261 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang a: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int temp;
        int i;
        for (i = 0; i < n-1; i++) {
            if (a[i] > 0) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] > 0 && a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        System.out.println("Mang sau khi sap xep: ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
