/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.a;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai082 {

    public void tich82() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = scan.nextFloat();
        System.out.print("Nhap b: ");
        float b = scan.nextFloat();
        System.out.print("Nhap c: ");
        float c = scan.nextFloat();
        float max = a;
        if (max < b) {
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.println("so lon nhat la: " + max);
    }
}
