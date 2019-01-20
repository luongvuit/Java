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
public class Bai272 {

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
        int c;
        int max = a[0];
        for (i = 1; i < n; i++) {
            max = (a[i] > max) ? a[i] : max;
        }
        int k = max;
        for (i = c = 0 ; i < n; i++) {
            if (a[i]!=k) {
                a[c] = a[i];
                c++;
            }
        }
        n = c;
        System.out.print("Mang sau khi xoa: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
