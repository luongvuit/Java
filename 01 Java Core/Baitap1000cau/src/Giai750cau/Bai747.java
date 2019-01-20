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
public class Bai747 {
    public static int Tong(int n){
        if(n%2!=0)
            return n;
        return Tong(n/2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int s = Tong(n);
        System.out.print(s);
    }
}
