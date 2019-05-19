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
public class Bai222 {

    public void tich222() {
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
            if(i==0 && a[i] != a[i+1]){
                dem++;
            }
            else if(i==n && a[i-1] != a[i] ){
                dem++;
            }
            else if((a[i-1]>a[i] && a[i]<a[i+1])||(a[i-1]<a[i])&& a[i]>a[i+1]){
                dem++;
            }
        }
        System.out.println("Ket qua: " + dem);
    }
    
}
