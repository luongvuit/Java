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
public class Bai106 {

    public void tich106() {
        int abc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so: ");
        abc = scan.nextInt();
        if(abc<100||abc>999){
            System.out.println("Nhap so khong hop le.");
        }
        else{
            int a = abc%10;
            abc /=10;
            int b = abc%10;
            int c = abc/10;
            if(a==1){
                System.out.print("Mot");
            }
            else if(a==2){
                System.out.print("Hai");
            }
            else if(a==3){
                System.out.print("Ba");
            }
            else if(a==4){
                System.out.print("Bon");
            }
            else if(a==5){
                System.out.print("Nam");
            }
            else if(a==6){
                System.out.print("Sau");
            }
            else if(a==7){
                System.out.print("Bay");
            }
            else if(a==8){
                System.out.print("Tam");
            }
            else if(a==9){
                System.out.print("Chin");
            }
            System.out.print(" Tram ");
            if(b==1){
                System.out.print("Mot");
            }
            else if(b==2){
                System.out.print("Hai");
            }
            else if(b==3){
                System.out.print("Ba");
            }
            else if(b==4){
                System.out.print("Bon");
            }
            else if(b==5){
                System.out.print("Nam");
            }
            else if(b==6){
                System.out.print("Sau");
            }
            else if(b==7){
                System.out.print("Bay");
            }
            else if(b==8){
                System.out.print("Tam");
            }
            else if(b==9){
                System.out.print("Chin");
            }
            System.out.print(" Muoi ");
            if(c==1){
                System.out.println("Mot");
            }
            else if(c==2){
                System.out.println("Hai");
            }
            else if(c==3){
                System.out.println("Ba");
            }
            else if(c==4){
                System.out.println("Bon");
            }
            else if(c==5){
                System.out.println("Nam");
            }
            else if(c==6){
                System.out.println("Sau");
            }
            else if(c==7){
                System.out.println("Bay");
            }
            else if(c==8){
                System.out.println("Tam");
            }
            else if(c==9){
                System.out.println("Chin");
            }
            }
        }
    }
    

