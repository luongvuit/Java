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
public class Bai012 {

    private int x, n;
    private double s = 0;

    public void tich12() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao lan luot gia tri x va n: ");
        x = scan.nextInt();
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, i);
        }
        System.out.println(s);
    }

}
