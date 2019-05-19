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
public class Bai018 {

    private int n, x,s;
    private double p=1,m=1;
    private double t ;

    public void tich18() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap lan luot gia tri x va n: ");
        x = scan.nextInt();
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            s=(2*i);
            m=m*s*(s-1);
            t = Math.pow(x, (2 * i));
            p += t / m;
        }
        System.err.println(p);
    }

}
