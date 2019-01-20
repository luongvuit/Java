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
public class Bai101 {

    public void tich101() {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Nhap thang: ");
        n = scan.nextInt();
        if (n < 1 || n > 12) {
            System.out.println("Nhap n khong hop le");
        } else {
            switch (n) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 ngay");
                    break;
                case 2:
                    int a;
                    System.out.print("Nhap nam: ");
                    a = scan.nextInt();
                    if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
                        System.out.println("29 ngay");
                    } else {
                        System.out.println("28 ngay");
                    }
                    break;
                default:
                    System.out.println("30 ngay");
            }
        }
    }
}
