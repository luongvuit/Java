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
public class Bai271 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang a: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        System.out.print("Nhap vi tri xoa: ");
        int k = scan.nextInt();
        for (int i = k; i < n; i++) {
            a[i] = a[i + 1];
        }
        n--;
        System.out.print("Mang sau khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
