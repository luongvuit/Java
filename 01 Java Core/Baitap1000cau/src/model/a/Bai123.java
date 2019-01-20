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
public class Bai123 {
    public void tich123() {
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);
        int min = 0;
        System.out.print("Nhap cac so vao mang: ");
        for (int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();
            if(a[i]<a[0]){
                min = i;
            }
        }
        System.out.println("Vi tri so thap nhat: " + (min+1));
    }
    
}
