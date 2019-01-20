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
public class Bai059 {
    public boolean baitap(int n){
        int a=0,temp;
        temp = n;
        if(n<=0){
            return false;
        }
        else{
            while(temp!=0){
                a = a*10+temp%10;
                temp/=10;                
            }
        if(a==n){
                return true;
            }
            else{
                return false;
            }
        }
    }     
    
    
    public void tich59() {
         Bai059 bt = new Bai059();
         Scanner scan = new Scanner(System.in);
         System.out.println("Nhap n: ");
         int n = scan.nextInt();
         System.out.println("Ket qua: " + bt.baitap(n));
    }
    
}
