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
public class Bai157 {
    int []baitap(int a[],int n){
    int max = a[0],min = a[0];
        for (int i = 0; i < n; i++) {
            max = (a[i]>max) ? a[i] : max;
            min = (a[i]<min) ? a[i] : min;
        }
        int arr[] = {max,min};
        return arr;
    }
    public void tich157() {
    int a[] = new int[100];
    Bai157 bt = new Bai157();
    Scanner scan = new Scanner(System.in);
    System.out.print("Nhap so phan tu cua mang: ");
    int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        System.out.println("Ket qua: " + bt.baitap(a, n)[1] + " , " + bt.baitap(a, n)[0] );
    }
    
}
