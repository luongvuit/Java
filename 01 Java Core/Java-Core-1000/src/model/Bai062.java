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
public class Bai062 {
    public int baitap(int a,int b){
        int max = 0;
        if(a<=0 && b<=0 ){
            System.out.println("Nhap n khong hop le.");
        }
        else{
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                if(a%i==0 && b%i==0){
                    if(i>max){
                        max = i;
                }
                }
            }
        }
    }
        return max;
    }
    public void tich62() {
        Bai062 bt = new Bai062();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scan.nextInt();
        System.out.print("Nhap b: ");
        int b = scan.nextInt();
        System.out.println("Uoc chung lon nhat: " + bt.baitap(a, b));
    }
    
}
/* cach 2:
int tich = a*b;
while(a!=b){
if(a>=b){
a-=b;
}
else{
b-=a;
}
System.out.println("uoc chung lon nhat: " + a);
*/