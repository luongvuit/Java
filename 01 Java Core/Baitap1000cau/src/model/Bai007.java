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
public class Bai007 {

    private int n;
    private double result = 0;

    public void sum7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao gia tri n bai 7: ");
        n = scan.nextInt();
        for (double i = 0; i <= n; i++) {
            result += i/(i+1) ;
        }
        System.out.println(result);
    }

}
