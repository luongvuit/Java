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
public class Bai015 {

    private int n;
    private double t=0;
    private double s=0;

    public void tich15() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap gia tri n cua bai 15: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            s += i;
            t += 1 / s;
        }
        System.out.println(t);
    }

}
