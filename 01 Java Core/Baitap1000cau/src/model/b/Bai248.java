/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.b;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai248 {

    public void tich248() {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int flag = 1;
        for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i+1]) {
                    flag = 0;
                }
            }
        System.out.println(flag);
        }
    }
