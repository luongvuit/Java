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
public class Bai006 {

    private int n;
    private double result = 0;

    public void sum6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao gia tri n cua bai 6: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            double tu = 1;
            double mau = i * (i + 1);
            result += tu / mau;
        }
        System.out.println(result);
    }

}
