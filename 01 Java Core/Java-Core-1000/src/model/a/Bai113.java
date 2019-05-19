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
public class Bai113 {
int baitap(int n){
    if(n==0)
        return 1;
    return n*baitap(n-1);
}
    public void tich113() {
        Bai113 bt = new Bai113();
        int i =0; 
        float e = (float) 0.0001;
        double x;
        double s=0,s1=0,s2=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = scan.nextDouble();
        x = x*Math.PI/180;
        do{
            s1 = s2;
            s+= Math.pow(-1, i)*Math.pow(x, 2*i+1)/bt.baitap(2*i+1);
            s2 = s;
            i++;
        }while(Math.abs(s1-s2)>e);
        System.out.println("Ket qua: " + s2); 
    }
    
}
