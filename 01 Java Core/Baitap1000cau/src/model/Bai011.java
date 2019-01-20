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
public class Bai011 {

    private int s = 0, p = 1, n;

    public void tich11() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao gia tri n bai 11: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            p *= i;
            s += p;
        }
        System.out.println(s);
    }

}
