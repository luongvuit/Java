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
public class Bai021 {
    private int n;
    private int s = 0;
    public void tich21() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scan.nextInt();
        if(n<=0) System.out.println("Nhap n khong hop le.");
        else {
            for (int i = 1; i <= n; i++) {
                if(n%i==0)
                    s+=i;
            }
            System.out.println("Ket qua: " + s);
        }
    }
}
