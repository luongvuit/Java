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
public class Bai702 {
    public static int Tong(int n){ //giong bai 730 (de quy thuong)
        if(n==0)
            return 0;
        return Tong(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,s;
        System.out.print("Nhap n: ");
        n = scan.nextInt();
        s=Tong(n);
        System.out.print(s);
    }
}
