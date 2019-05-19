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
public class Bai710 {
    public static float thuattoan(float x,int n){
        if(n==0)
            return 0;
        if(n==1)
            return x;
        return (1 + x/n) * thuattoan(x, n - 1) - (x/n) * thuattoan(x, n - 2); // tranh ra so am giai thua vi return la 0
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = scan.nextInt();
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        float ketqua = thuattoan(x,n);
        System.out.println(ketqua);
    }
}
