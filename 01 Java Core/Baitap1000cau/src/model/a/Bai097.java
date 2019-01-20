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
public class Bai097 {
    public void tich97() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scan.nextInt();
        System.out.print("Nhap b: ");
        int b = scan.nextInt();
        System.out.print("Nhap c: ");
        int c = scan.nextInt();
        if(a+b>c&&(a+c>b)&&(b+c>a)&&(a>0)&&(b>0)&&(c>0)){
            System.out.print("a,b,c la canh cua: ");
        if((a==b)&&(b==c)){
        System.out.println("tam giac deu");
        }
        else if ((a==b)||(b==c)||(a==c)) {
            System.out.println("tam giac can");    
                }
        else if(((a*a+b*b==c*c)&&(a==b))||((b*b+c*c==a*a)&&(b==c))||((a*a+c*c==b*b)&&(a==c))){
            System.out.println("Tam giac vuong can");
    }
        else if((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==a*a+b*b)){
            System.out.println("Tam giac vuong");
        }
        else{
            System.out.println("Tam giac thuong");
        }
        }
        else{
            System.out.println("3 canh tam giac khong hop le.");
        }
    }
    
}
