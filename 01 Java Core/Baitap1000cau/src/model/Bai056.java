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
public class Bai056 {
public boolean baitap(int n){
    boolean check = false;
    if(n<=0){
        System.out.println("Nhap n khong hop le.");
    }
    else{
        while(n>10){
            n/=10;
            if((n%10)%2==0){
                check = false;
                break;
            }
            else {
                check = true;
            }
            break;
        }    
    }
    return check;
}
    public void tich56() {
        Bai056 bt = new Bai056();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Ket qua: " + bt.baitap(n));
    }
    
}
