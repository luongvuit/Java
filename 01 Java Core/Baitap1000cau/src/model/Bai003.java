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
public class Bai003 {

    private int n;
    private float s = 0;

    public void sum3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap gia tri n bai 3: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            s += (1.0 / i);
        }
        System.out.println(s);
    }
}
