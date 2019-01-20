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
public class Bai315 {

    static int n,m;
    static float a[][];

    public static void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        n = scan.nextInt();
        System.out.print("Nhap so cot: ");
        m = scan.nextInt();
        a = new float [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("  a[" + i + "," + j + "]=");
                a[i][j] = scan.nextFloat();
            }
        }
    }

    public static void xuat() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    float baitoan(){
    float max = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        return max;
}

    public static void main(String[] args) {
        nhap();
        xuat();
        Bai315 bt = new Bai315();
        System.out.println("Max: " + bt.baitoan());
    }
}
