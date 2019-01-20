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
public class Bai041 {
    public float baitap(int n){
        float S = 1;
        if(n<0) {
            System.out.println("Nhap n khong hop le.");
        }
        else{
            for (int i = 0; i <= n; i++) {
                S =  (float) (1.0 + 1.0/S);
            }
        }
        return S-1;
    }
    public void tich41() {
        Bai041 bt = new Bai041();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Ket qua: " + bt.baitap(n));
    }
    
}
