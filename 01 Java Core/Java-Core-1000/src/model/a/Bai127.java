/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.a;

import java.util.Scanner;
// import java.util.Arrays; Arrays.sort(a); cau lenh nay su dung de sap xep cac phan tu trong mang A cho truoc so
/**
 *
 * @author Hoang Anh
 */
public class Bai127 {

    public void tich127() {
        int n,temp;
        int a[] = new int[100];
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        }while(n<0);
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i +":");
            a[i] = sc.nextInt();
        }
        System.out.println("Mang ban dau la: ");
        for(i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        // sap xep theo bubble sort so sanh lien tuc va doi cho cac phan tu lien ke trong mang
        for (i = 1; i < n; i++) {            
                if(a[i-1]>a[i]){   
                    temp = a[i-1];
                    a[i-1]=a[i];
                    a[i]=temp;
                }
        }
        System.out.print("Mang sau khi sap xep: ");
        for ( i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
    
}
