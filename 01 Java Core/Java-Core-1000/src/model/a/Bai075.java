/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.a;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai075 {
    public boolean baitap(int n){
    int p = 1;
    boolean c = true;
        for (int k=1; p < n; k++) {
            p*=2; // bai 76 thi sua thanh p*=3;
        }
        if(p==n){
            return c;        
        }
        else{
            return false;
        } 
    }
    public void tich75() {
        Bai075 bt = new Bai075();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Ket qua: " + bt.baitap(n));
    }
    
}
