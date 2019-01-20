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
public class Bai065 {
public float[] baitap(float a,float b,float c){
    float x1=0,x2=0,del;    
    if(a==0)
        if(b==0)
            if(c==0)
                System.out.println("Phuong trinh vo so nghiem.");
            else{
                System.out.println("Phuong trinh vo nghiem.");
            }
        else{
             x1= -c/b;
            }
    else{
        del = (float) (Math.pow(b, 2) - 4*a*c);
        if(del<0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(del==0){
            x1=x2=-b/(2*a);
            System.out.println("Phuong trinh co nghiem kep: " + x1);
        }
        else{
            x1=(float) (-b+Math.sqrt(del))/(2*a);
            x2=(float) (-b-Math.sqrt(del))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem: \n x1 = "+x1+"\n x2 = "+x2);
        }
    }
   float [] arr = {x1,x2};
   return arr;
}
    public void tich65() {
         Bai065 bt = new Bai065();
         Scanner scan = new Scanner(System.in);
         System.out.print("Nhap a: ");
         float a = scan.nextFloat();
         System.out.print("Nhap b: ");
         float b = scan.nextFloat();
         System.out.print("Nhap c: ");
         float c = scan.nextFloat();
         System.out.println("Ket qua: \n" + bt.baitap(a, b, c)[0]  + "\n" + bt.baitap(a, b, c)[1]); 
    }
    
}
