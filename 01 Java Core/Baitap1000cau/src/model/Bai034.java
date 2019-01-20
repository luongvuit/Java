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
public class Bai034 {
    public float tinhtoan(int n){
        float S = 0;
        if(n<1) {
            System.out.println("Nhap n khong hop le.");
        }
        else {
            for (int i = 1; i <= n; i++) {
                S = (float) Math.sqrt(S+i);
            }
        }
        return S;
    }
    public void tich34() {
        Bai034 tt = new Bai034();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Ket qua: " + tt.tinhtoan(n));
}
}
