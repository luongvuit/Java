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
public class Bai122 {
    public void tich122() {
    int a[] = new int[5];
    Scanner scan = new Scanner(System.in);
    int max = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();
             max = a[0];
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Gia tri lon nhat cua mang: " + max);
    }
    
}
