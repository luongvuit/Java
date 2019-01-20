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
public class Bai292 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a[] = new float[100];
        int b[] = new int[100];
        System.out.print("Nhap so phan tu cua mang a: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextFloat();
        }
        int i;
        for (i = 0; i < n; i++) {
            float c = a[i] - (int) a[i];
            if (c >= 0.5) {
                a[i] +=1;
            } else{
                a[i] = a[i];
            }
        }

        System.out.print("Mang sau khi lam tron: ");
        for (i = 0; i < n; i++) {
            System.out.print((int)a[i] + "\t");
        }
    }
}
