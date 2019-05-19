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
public class Bai255 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang a: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Mang ban dau la: ");
            a[i] = scan.nextInt();
        }
        int temp;
        int i;
        for (i = 1; i < n; i++) {
            if (a[i - 1] > a[i]) {
                temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
            }
        }
        System.out.print("Mang duoc sap xep la: ");
        for (i = 0; i < n; i++) {
            System.out.print(+a[i] + "\t");
        }
    }
}
