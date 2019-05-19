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
public class Bai347 {

    public static void nhap(int a[][], int n, int m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "] ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void xuat(int a[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]);
                System.out.print("    ");
            }
            System.out.println("");
        }
    }

    public static int max(int b, int c) {
        int max;
        max = (b > c) ? b : c;
        return max;
    }

    public static int min(int b, int c) {
        int min;
        min = (b > c) ? c : b;
        return min;
    }

    public static int yenngua2(int a[][], int n, int m) {
        int max_hang = 0, min_cot, dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max_hang = max(max_hang, a[i][j]);
            }
            for (int j = 0; j < m; j++) {
                min_cot = a[i][j];
                for (int x = 0; x < n; x++) {
                    min_cot = min(min_cot, a[x][j]);
                }
                if (max_hang == min_cot) {
                    dem++;
                    System.out.println("Phan tu yen ngua: " + max_hang);
                }
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cột: ");
        int n = sc.nextInt();
        System.out.print("Nhập số hàng: ");
        int m = sc.nextInt();
        int Array[][] = new int[n][m];
        nhap(Array, n, m);
        xuat(Array, n, m);
        System.out.println(yenngua2(Array, n, m));
    }
}
