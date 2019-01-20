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
public class Bai291 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang a: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int i;
        int min = a[0];
        int max = a[0];
        for (i = 1; i < n; i++) {
            max = (a[i] > max) ? a[i] : max;
            min = (a[i] > min) ? min : a[i];
        }
        for (i = 0; i < n; i++) {
            if (a[i] == max) {
                a[i] = min;
            } else if (a[i] == min) {
                a[i] = max;
            }
        }
        System.out.print("Mang sau sap xep: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
