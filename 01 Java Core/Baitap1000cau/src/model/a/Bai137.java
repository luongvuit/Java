/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.a;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai137 {

    public void tich137() {
        int a[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int min;
        min = 0;
        int i;
        for (i = 0; i < n; i++) {
            if(a[i]<a[min]){
                min = i;
            }
        }
        System.out.println("Vi tri nho nhat: " + min);
    }
}

