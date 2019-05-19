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
public class Bai250 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int d = a[1] - a[0];
        int flag = 1;
        for (int i = 2; i < n - 1; i++) {
            if ((a[i + 1] - a[i]) != d) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Mang la csc va cong sai: " + d);
        } else {
            System.out.println("Khong la csc");
        }
    }
}
