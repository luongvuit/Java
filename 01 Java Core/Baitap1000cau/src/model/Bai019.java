/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai019 {

    private int x, n, s, m = 1;
    private double p = 1, t,k;

    public void tich19() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap lan luot gia tri x va n: ");
        x = scan.nextInt();
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            s = 2 * i + 1;
            m = m * s * (s - 1);
            t = Math.pow(x, (2 * i + 1));
            p += x + t / m;
        }
        for (int j = 1; j <= n; j++) {
            p-=j;
            k=p-1;
        }
                System.out.println(k);
    }

}
