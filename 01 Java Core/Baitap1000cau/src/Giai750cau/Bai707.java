/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giai750cau;

import java.util.Scanner;
/**
 *
 * @author Hoang Anh
 */
public class Bai707 {
    public static float Fibo(int n){
        if(n==0)
           return 0;
        if(n==1)
           return 1;
        return Fibo(n-1)+Fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        float tong = Fibo(n);
        System.out.println(tong);
    }
}
