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
public class Bai317 {

    static int n, m, a[][];

    public static void nhapmatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so hang: ");
        n = input.nextInt();
        System.out.print("nhap so cot: ");
        m = input.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("  a[" + i + "," + j + "]=");
                a[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuatmatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static int KiemTraNguyenTo(int n) {
        if (n < 2) {
            return 0;
        } else if (n > 2) {
            if (n % 2 == 0) {
                return 0;
            }
            for (int i = 3; i < n; i += 2) {
                if (n % i == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int DemSoNguyenToTrongMaTran() {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (KiemTraNguyenTo(a[i][j]) == 1) {
                    dem++;
                }
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        nhapmatrix();
        xuatmatrix();
        int dem = DemSoNguyenToTrongMaTran();
        System.out.println(dem);
    }
}
