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
public class Bai309 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        int b[] = new int[100];
        System.out.print("Nhap so phan tu cua mang a: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int j = 0;
        System.out.print("Mang b la: ");
        for (int i = 0; i < n; i++) {
                if (i == 0) {
                    b[j] = a[i + 1];
                } else if (i == n - 1) {
                    b[j] = a[i - 1];
                } else {
                    b[j] = a[i - 1] + a[i + 1];
                }
                System.out.print(b[j] + "\t");
                j++;
            }
            
        }
    }

