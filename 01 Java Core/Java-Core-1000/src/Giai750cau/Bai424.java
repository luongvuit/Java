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
public class Bai424 {

    public static void xuat(int a[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void taomangzigzag(int a[][], int n, int m) {
        int dem = 1;
        for (int i = 0; i < n; i++) {
            // Với mỗi dòng chẵn, dem sẽ được gán vào từng phần tử của các cột từ trái sang phải
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = dem++;
                }
            } // Với mỗi dòng lẻ, dem sẽ được gán vào từng phần tử của các cột từ phải sang trái
            else {
                for (int j = m - 1; j >= 0; j--) {
                    a[i][j] = dem++;
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
        System.out.println("Mang xoan oc: ");
        taomangzigzag(a, n, m);
        xuat(a, n, m);
    }
}
