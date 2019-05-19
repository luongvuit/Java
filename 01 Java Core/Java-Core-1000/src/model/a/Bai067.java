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
public class Bai067 {
    public float baitap(int x,int n){
        float s = 0;
        int i = 1;
        float t=1;
        float a;
        if(n<1){
            System.out.println("Nhap n khong hop le.");
        }
        else{
        while(i<=n){
        t = (float) Math.pow((-1), (i+1));
        a = (float) Math.pow(x, i);
        s += t*a;
        i++;
}
    }
        return s;
    }
    public void tich67() {
        Bai067 bt = new Bai067();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = scan.nextInt();
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Ket qua: " + bt.baitap(x, n));
    }
}
