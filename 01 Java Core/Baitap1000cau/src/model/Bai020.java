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
public class Bai020 {
    private int n;
    public void tich20() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao gia tri n: ");
        n = scan.nextInt();
        if(n<=0) {
            System.out.println("Nhap k hop le.");
        }
        else {
        for (int i = 1; i <= n; i++) {
            if(n%i==0) 
                System.out.println(i);;
        } 
        }
    }
}
