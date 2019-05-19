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
public class Bai704 {
    public static void nhap(int a[], int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
                System.out.print("a[" + i + "]=");
                a[i] = scan.nextInt();
            }
            System.out.println();
        }   
    public static void xuat(int a[], int n) {
        for (int i = 0; i < n; i++) {
                System.out.print(a[i] + "\t");
            }
            System.out.println();
        }
    public static float tongchan(int a[],int n){
        if(n==0)
            return 0;
        float s=tongchan(a,n-1);
        if(a[n-1]%2==0){
            s+=a[n-1];
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int a[] = new int[n];
        nhap(a, n);
        System.out.println("Mang truoc: ");
        xuat(a, n);
        float tong = tongchan(a,n);
        System.out.print(tong);
    }
}
