/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.a;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai111 {

    public void tich111() {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + i - 1; j++) {
                System.out.print((j < n - i + 1) ? " " : "*");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n + i - 1; ++j) {
                System.out.print((j==n-i+1||j==n+i-1||i==n) ? "*":" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((j<=i) ? "*":" ");
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((j==i||j==1||i==n)? "*": " ");
            }
            System.out.print("\n");
        }
    }
}
