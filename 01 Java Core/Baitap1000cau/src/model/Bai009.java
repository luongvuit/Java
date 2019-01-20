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
public class Bai009 {

    private int n;
    private int t = 1;

    public void sum9() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao gia n cua bai 9: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            t *= i;
        }
        System.out.println(t);
    }

}
