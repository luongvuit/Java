/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.a;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai066 {
    public float[] baitap(float a, float b,float c){
        float x1 = 0,x2 = 0,x3 = 0,x4 = 0,del,t1,t2;
        if(a==0)
            if(b==0)
                if(c==0)
                    System.out.println("Phuong trinh vo so nghiem.");               
                else  {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            else{
                t1 = -c/b;
                if(t1<0) {
                    System.out.println("Phuong trinh vo nghiem");
                }
                else{
                    x1 = (float) Math.sqrt(t1);
                    x2 = -x1;
                    System.out.println("Phuong trinh co 2 nghiem: x1=" + x1 + " x2=" + x2 );
                }
            }
        else{
            del = (float) (Math.pow(b,2) - 4*a*c);
            if(del<0) {
                System.out.println("Phuong trinh vo nghiem.");
            }
            else if(del==0){
                t1 = t2 = -b/(2*a);
                if(t1<0) {
                    System.out.println("Phuong trinh vo nghiem.");
                }
                else {
                    if(t1>=0){
                    x1 = (float) Math.sqrt(t1);
                    x2 = -x1;
                    }
                    if(t2>=0){
                    x3 = (float) Math.sqrt(t2);
                    x4 = -x3;
                }
                }
            }
            else {
                t1 = (float) (-b+Math.sqrt(del))/(2*a);
                t2 = (float) (-b-Math.sqrt(del))/(2*a);
                if(t1<0) {
                    System.out.println("Phuong trinh vo nghiem.");
                }
                else {
                    if(t1>=0){
                    x1 = (float) Math.sqrt(t1);
                    x2 = -x1;
                    }
                    if(t2>=0){
                    x3 = (float) Math.sqrt(t2);
                    x4 = -x3;
                }
            }
        }
            }
        float arr[] = {x1,x2,x3,x4};
        return arr;
    }
    public void tich66() {
        Bai066 bt = new Bai066();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = scan.nextFloat();
        System.out.print("Nhap b: ");
        float b = scan.nextFloat();
        System.out.print("Nhap c: ");
        float c = scan.nextFloat();
        System.out.print(Arrays.toString(bt.baitap(a, b, c)));
    }
    
}
