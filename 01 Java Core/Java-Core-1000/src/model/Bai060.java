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
public class Bai060 {
    public boolean baitap(int n){
        boolean c = true;
        int a = n;
        int b = a%10;
        a/=10;
        while(a!=0){
            int d = a%10;
            a/=10;
            if(b<d){ // neu giam dan thi doi b>d
                c = false;  
                break;
            }
            else{
                b=d;
            }
        }
        if(c){
            return true;
        }
        else {
            return false;
        }
    }
    public void tich60() {
         Bai060 bt = new Bai060();
         Scanner scan = new Scanner(System.in);
         System.out.println("Nhap n: ");
         int n = scan.nextInt();
         System.out.println("Ket qua: " + bt.baitap(n));
    }
    
}
