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
public class Bai099 {

    public void tich99() {
        Scanner scan = new Scanner(System.in);
        int temp;
        System.out.print("Nhap a: ");
        int a = scan.nextInt();
        System.out.print("Nhap b: ");
        int b = scan.nextInt();
        System.out.print("Nhap c: ");
        int c = scan.nextInt();
        if(a>b){
            temp = a; a=b; b = temp;
        }
        if(a>c){
            temp = a; a=c; c = temp;
        }
        if(b>c){
            temp = b; b=c; c = temp ;
        }
            System.out.println("Sap xep tang dan: " + a + " " + b + " " + c);
    }
    
}
