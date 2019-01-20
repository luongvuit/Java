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
public class Bai169 {
    
    public void tich169() {
        int a[] = new int[100]; 
        int b[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        int c[] = new int[100];
        int max1 = c[0];
        int min1 = b[0];
        for (int i = 1; i < n; i++) {
            if((a[i]%2)==1){
                b[i] = a[i];
                if(b[i]>=min1){
                    min1 = b[i];
                }
            }
            else{
                c[i] = a[i];
                if(c[i]>max1)
                    max1 = c[i];
        }
        }
        System.out.println(min1);
        System.out.println(max1);
        if(max1<min1){
            System.out.println("Ket qua: " + max1);
        }
    }
    
}
