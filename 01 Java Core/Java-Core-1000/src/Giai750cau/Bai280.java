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
public class Bai280 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        int b[] = new int[100];
        System.out.print("Nhap so phan tu cua mang a: ");
        int n = scan.nextInt();
        int i, k;
        int j;
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        System.out.println("Chon vi tri: ");
        k = scan.nextInt();
        b[0] = a[k];
        for (i = 0; i < n; i++) {
            if (i > k) {
                for (j = i; j < n; j++) {
                    b[j] = a[i];
                }
            }if (i < k) {
                b[i + 1] = a[i];
            }
        }
        
        System.out.print("Mang sau sap xep: ");
        for (j = 0; j < n; j++) {
            System.out.print(b[j] + "\t");
        }
    }
}
