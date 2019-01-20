/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.b;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai232 {

    public void tich232() {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[100];
        int b[] = new int[100];
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = scan.nextInt();
        }
        for (i = 0; i < n - 1; i++) { //hoan vi cac phan tu
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int dem = 1, j = 1;
        b[0] = a[0]; //khoi tao phan tu dau tien cua mang b bang phan tu cua mang a
        for (i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                dem++;
                b[j++] = a[i]; // dua cac phan tu phan biet cua mang a vao trong mang b
            }
        }
        for (j = 0; j < dem; j++) {
            int dem1 = 0;
            for (i = 0; i < n; i++) {
                if (b[j] == a[i]) { // so sanh mang b voi mang a ban dau
                    dem1++;
                }
            }
            if (dem1 > 1) { // truong hop bien dem lon hon 1 thi in ra cac gia tri thoa do la cac gia tri xuat hien hon 1 luan
                System.out.println(b[j]);
            }
        }
    }

}
