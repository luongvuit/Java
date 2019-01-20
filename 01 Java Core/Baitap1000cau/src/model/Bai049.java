/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

    /**
     *
     * @author Hoang Anh
 */
public class Bai049{
    public int baitap(int n){
        int s=0;
        while(n>10){
            s=n/10;
            n/=10;
    }
        return s;
    }
    public void tich49() {
        Bai049 bt = new Bai049();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        System.out.println("Chu so dau tien: " + bt.baitap(n));
}
}

    
