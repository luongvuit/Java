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
public class Bai017 {

    private int x, n;
    private double s=1 ;
    private double t, p;

    public void tich17() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap lan luot gia tri x va n: ");
        x = scan.nextInt();
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            s *= i;
            t = Math.pow(x, i);
            p += t / s;
        }
        System.out.println(p);
    }

}
