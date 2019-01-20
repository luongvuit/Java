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
public class Bai257 {
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
        for (int i = 0; i < n; i++) {
            if(i%2==1){
                for (int j = 1; j < n; j+=2) {
                    if(a[i]<a[j]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        System.out.print("Mang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
