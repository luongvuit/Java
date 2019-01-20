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
public class Bai016 {

    private int x, n;
    private double s = 0, t = 0;
    private double p;

    public void tich16() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao gia tri lan luot x va n: ");
        x = scan.nextInt();
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            t = Math.pow(x, i);
            s += i;
            p += t / s;
        }
        System.out.println(p);
    }

}
