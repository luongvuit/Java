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
public class Bai762 {
    public static boolean Tong(int n){
        if(n==0)
            return true;
        if((n%10)%2==0)
            return false;
        return Tong(n/10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        boolean s = Tong(n);
        System.out.print(s);
    }
}
