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
public class Bai038 {
    public float baitap(int n){
        float S=0;
        if(n<1){
            System.out.println("Nhap n khong hop le.");
        }
        else{
            for (int i = 1; i <= n; i++) {
                S = (float) Math.pow((i+S)*1.0, 1.0/(i+1));
            }
        }
        return S;
    }
    public void tich38() {
        Bai038 bt = new Bai038();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Ket qua: " + bt.baitap(n));
    }
    
}
