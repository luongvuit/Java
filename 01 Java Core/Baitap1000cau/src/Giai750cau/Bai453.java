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
public class Bai453 {
    public static void nhap(int a[][], int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "," + j + "]=");
                a[i][j]=scan.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuat(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int thuattoan(int a[][], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(a[i][i]>0){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        nhap(a, n);
        System.out.println("Mang truoc: ");
        xuat(a, n);
        int count = thuattoan(a, n);
        System.out.println("Tong : " + count);
    }
}
