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
public class Bai124 {

    public void tich124() {
        int a[] = new int[100];
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = scan.nextInt();
        int i, b;
        for (i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && a[i] < 2004) {
                System.out.println("Co ton tai");
            } else {
                System.out.println("Khong ton tai");
            }
        }
    }
}
