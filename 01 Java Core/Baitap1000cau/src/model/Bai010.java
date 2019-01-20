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
public class Bai010 {

    private int x, n;
    public void tich10() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao gia tri cua x va n lan luot: ");
        x = scan.nextInt();
        n = scan.nextInt();
        double t =Math.pow(x, n);
        System.out.println(t);
    }
}
