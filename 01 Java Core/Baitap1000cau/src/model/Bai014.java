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
public class Bai014 {

    private int x, n;
    private double s = 0;

    public void tich14() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap lan luot gia tri x va n: ");
        x = scan.nextInt();
        n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            s += Math.pow(x, (2 * i + 1));
        }
        System.out.println(s);
    }

}
