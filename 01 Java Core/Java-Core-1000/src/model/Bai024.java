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
public class Bai024 {
    private int n;
    public void tich24() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scan.nextInt();
        if(n<=0) System.out.println("Nhap n khong hop le.");
        else{
            for (int i = 1; i <= n; i++) {
                if(n%i==0 & i%2==1) System.out.println(i);
            }
        }
    }
    
}
