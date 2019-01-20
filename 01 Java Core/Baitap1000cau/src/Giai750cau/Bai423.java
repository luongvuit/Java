/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giai750cau;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class Bai423 {

    public static void xuat(int a[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void taomangxoanoc(int a[][], int n, int m) {
        int trai = 0, tren = 0, duoi = n, phai = m, dem = 0, b = n * m;
	while(dem < b)
	{
		// chạy hàng trên
		for(int i = trai; i < phai; i++)
		{
			if(dem < b)
			{
				a[tren][i] = dem++;
			}
		}
		tren++; 
		// chạy cột phải
		for(int i = tren; i < duoi; i++)
		{
			if(dem < b)
			{
				a[i][phai - 1] = dem++;
			}
		}
		phai--;
		// chạy hàng dưới
		for(int i = phai - 1; i >= trai; i--)
		{
			if(dem < b)
			{
				a[duoi - 1][i] = dem++;
			}
		}
		duoi--;
		// chạy cột trái
		for(int i = duoi - 1; i >= tren; i--)
		{
			if(dem < b)
			{
				a[i][trai] = dem++;
			}
		}
		trai++;
	}
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        int n = scan.nextInt();
        System.out.print("Nhap so cot: ");
        int m = scan.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Mang xoan oc: ");
        taomangxoanoc(a,n,m);
        xuat(a,n,m);
    }
}
