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
public class Bai400 {

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

    public static void xoadong(int a[][], int n, int m, int vtxoa) {
        for (int i = vtxoa; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = a[i + 1][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so cot: ");
        int n = scan.nextInt();
        System.out.print("Nhap so dong: ");
        int m = scan.nextInt();
        int a[][] = new int[n][m];
        nhap(a, n, m);
        xuat(a, n, m);
        System.out.print("Chon dong muon xoa: ");
        int vtxoa = scan.nextInt();
        xoadong(a, n, m, vtxoa);
        n--;
        System.out.println("Mang sau khi xoa: ");
        xuat(a, n, m);
    }
}
