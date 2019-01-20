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
public class Bai410 {
    public static void nhap(int a[][], int n, int m) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "," + j + "]=");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuat(int a[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void sapxep(int a[][], int n, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if(a[j][i]<a[k][i]){ // Bai409 thay a[j][i]>a[k][i]
                        int temp = a[j][i];
                        a[j][i]=a[k][i];
                        a[k][i]= temp;
                    }
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
        xuat(a, n, m);        
        sapxep(a, n, m);
        System.out.println("Mang sau khi xoay: ");
        xuat(a, n, m);
    }
}
