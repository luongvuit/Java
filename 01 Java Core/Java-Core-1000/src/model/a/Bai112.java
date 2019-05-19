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
public class Bai112 {

    public void tich112() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap m: ");
        int m = scan.nextInt();
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; j++) {  // m la chieu rong n la chieu dai
                if(i==1||i==m||j==1||j==n){ 
                    System.out.print("*");
                    if(j==n)
                        System.out.print("\n");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }
}