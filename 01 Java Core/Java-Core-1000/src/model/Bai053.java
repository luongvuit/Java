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
public class Bai053 {
public int baitap(int n){
    int i,max,k = 1; // k = 1 vi luon co 1 chu so lon nhat
    max = 0;   //bai 52 thi gan min=1 vi trong truong hop else if da co min==0 r 
    if(n<0) {
        System.out.println("Nhap n khong hop le.");
    }
    else if(n==0) {
        max = 0;
    }
    else {
        do{
            i=n%10;
            if(i==max){ // neu bai 051 thi k co phan nay
                k++;
            }               //
            if(i>max){
                max = i; 
            }
            n/=10;
        }while(n!=0);
    }
    return k;
}
    public void tich53() {
        Bai053 bt = new Bai053();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Ket qua: " + bt.baitap(n));
    }
    
}
