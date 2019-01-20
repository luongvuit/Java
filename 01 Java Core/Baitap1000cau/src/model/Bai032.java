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
public class Bai032 {
    public boolean kiemtra(int n){
        if(n<=0) {return false;}
        if(Math.sqrt(n)== (int)Math.sqrt(n)) {
            return true;
        }
        else {
            return false;
        }
    }
    public void tich32() {
        Bai032 kt = new Bai032();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        if(kt.kiemtra(n)){
            System.out.println("n la so chinh phuong");
        }
        else{
            System.out.println("n khong la so chinh phuong");
        }
    }
    
}
