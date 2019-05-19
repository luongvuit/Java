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
public class Bai226 {

    public void tich226() {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if((a[i]%2==0) &&  (a[i+1]%2==0)){
                dem++;
            }
        }
        System.out.println("Ket qua: " + dem);
    }
    
}
