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
public class Bai742 {
    public static float Tong(float x,int n){
        if(n==1)
            return x*x;
        return (float) (Tong(x,n-1)+Math.pow(x, 2*n));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        System.out.print("Nhap x: ");
        float x = scan.nextFloat();
        float s = Tong(x,n);
        System.out.print(s);
    }
}
