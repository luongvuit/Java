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
public class Bai735 {
    public static float Tong(int n){
        if(n==1)
            return (float) 0.5;
        return (float) (Tong(n-1)+(1.0/(n*(n+1))));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        float s=Tong(n);
        System.out.print(s);
    }
}
