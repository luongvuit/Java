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
public class Bai134 {

    public void tich134() {
        int a[] = new int[100];
        Scanner sc = new Scanner(System.in);       
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap phan tu thu: " + i + ":");
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int i;
        for (i = 1; i <= n; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Gia tri lon nhat: " + max);
        
    }
    
}
