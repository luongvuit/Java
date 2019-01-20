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
public class Bai174 {

    public void tich174() {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(a[i]<=a[j]){
                    System.out.println("Cap < " + a[i] + " , " + a[j] + " vi tri " + i + " va " + j);
                }
            }
        }
    }
    
}
