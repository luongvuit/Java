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
public class Bai394 {

    public static void nhap(int a[][], int n, int m) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" a[" + i + "," + j + "]=");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuat(int a[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void thuattoan(int a[][], int n, int m) {
        int temp[] = new int[100];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i] = a[0][j];
                a[0][j] = a[n - 1][j];
                a[n - 1][j] = temp[i];
            }
        }
        for (int i = 0; i < n; i++) {
            int fun;
            for (int j = 0; j < m; j++) {
                if(i>0&&i<n-1){
                    fun = a[i][j];
                    a[i][j]=a[i+1][j];
                    a[i+1][j]=fun; //ap dung voi 3 dong cuoi cung   
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        int n = scan.nextInt();
        System.out.print("Nhap so cot: ");
        int m = scan.nextInt();
        int a[][] = new int[n][m];
        nhap(a, n, m);
        System.out.println("Mang truoc khi sap xep");
        xuat(a, n, m);
        thuattoan(a, n, m);
        System.out.println("Mang sau khi sap xep: ");
        xuat(a, n, m);
    }
}
