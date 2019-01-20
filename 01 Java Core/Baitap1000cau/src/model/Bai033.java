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
public class Bai033 {
    public float tinhgiatri(int n){
        float S = (float) Math.sqrt(2);
        if(n<1) {System.out.println("Nhap n khong hop le.");}
        else {
            for (int i = 2; i <= n; i++) {
                S = (float) Math.sqrt(2+S);
            }
    }
        return S;
    }
    public void tich33() {
        Bai033 gt = new Bai033();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Ket qua: " + gt.tinhgiatri(n));
    }
}
        
    
        

