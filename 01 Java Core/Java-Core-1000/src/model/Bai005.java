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
public class Bai005 {

    private int n;
    private double result = 0;

    public void sum5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap gia tri cua n bai 5: ");
        n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            double tu = 1;
            double mau = 2 * i + 1;
            result += (tu / mau);
        }
        System.out.println(result);
    }
}
