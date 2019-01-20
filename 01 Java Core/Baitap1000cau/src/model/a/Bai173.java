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
public class Bai173 {

    public void tich173() {
         Scanner scan = new Scanner(System.in);
         int a[] = new int[100];
         int b[] = new int[100];
         System.out.print("Nhap so phan tu cua mang: ");
         int n = scan.nextInt();
         for (int i = 0; i < n; i++) {
             System.out.println("Nhap phan tu thu " + i + ": ");
             a[i] = scan.nextInt();
        }
         for (int i = 0; i < n; i++) {
            int themang = Math.abs(a[i]);
            while(themang != 0){
                int chuso = themang%10;
                themang/=10;
                b[chuso]++;
        }
    }
         int min = Math.abs(a[0]%10);
         for (int i = 0; i < n; i++) {
            if(b[i]!=0){
                min = (b[min]<b[i]) ? min : i;
            }
        }
         for (int i = 0; i < 10; i++) {
            if(b[i]!=0){
                System.out.println("Chu so " + i + " xuat hien: " + b[i]);
        }
    
}
         System.out.println("Chu so xuat hien it nhat: " + min);
}
}
