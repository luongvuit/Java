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
public class Bai096 {
    public int baitap(int x){
        int a;
        if(x>=5){
            a = (int) (2*Math.pow(x, 2) + 5*x + 9);
        }
        else{
            a = (int) (-2*Math.pow(x, 2) + 4*x -9);
        }
        return a;
    }
    public void tich96() {
        Bai096 bt = new Bai096();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = scan.nextInt();
        System.out.println("Ket qua: " + bt.baitap(x));
    }
    
}
