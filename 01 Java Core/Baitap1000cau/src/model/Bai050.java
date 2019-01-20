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
public class Bai050 {
    public void tich50() {
        int a = 0;
        Scanner scan = new Scanner(System.in);
         System.out.println("Nhap n: ");
         int n = scan.nextInt();
         do{
             a=a*10+n%10;
             n/=10;
         }while(n!=0);
             System.out.println("So nghich dao: " + a);
         }
         
    }
    

