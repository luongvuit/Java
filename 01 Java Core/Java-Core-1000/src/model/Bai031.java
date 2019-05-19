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
public class Bai031 {
    public boolean kiemtranguyento(int n){
        if(n<2) {
            return false;
        }
        for (int i = 2; i <= n ; i++) {
            if(n%i==0) {
            if(i!=n)
                return false;
            }
        }
        return true;
    }

     
    public void tich31() {
        Bai031 kt = new Bai031(); 
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        if(kt.kiemtranguyento(n)){
            System.out.println("n la so nguyen to");
        }
            else{
            System.out.println("n khong la so nguyen to");
        }
        }
}
        
        


