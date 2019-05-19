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
public class Bai115 {
  
    public void tich115() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ho ten: ");
        String hoten = scan.nextLine();
        System.out.print("Diem toan: ");
        double a = scan.nextDouble();
        System.out.print("Diem van: ");
        double b = scan.nextDouble();
        double dtb = (a+b)/2;
        System.out.println("Diem tong ket: " + dtb);
    }
    
}
