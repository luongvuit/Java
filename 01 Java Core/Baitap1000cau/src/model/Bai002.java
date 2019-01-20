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
public class Bai002 {
    private int n;// tạo 1 biến instance chưa có giá trị,nhưng mặc định của nó sẽ là 0
    //tiep theo la lam đbai 1 ở trong model, sau đó controler sẽ dùng bài 1 này, và view sẽ dùng
    private int s = 0;
    public void sum2(){
        Scanner scan = new Scanner(System.in);
         System.out.println("nhập n của bài 2");
        //tạo 1 đối tượng scanner, sau đó dùng đối tượng này nhập từ bàn phím
        // bằng next?
        // sau đó nhập từ bàn phím 1 số,gán nó cho n
        n = scan.nextInt();
        //scan.nextInt là nhập kiểu số nguyên
        //tiếp theo tính bài 1
        for (int i = 0; i <= n; i++) {
            s += Math.pow(i, 2); 
        }
        System.out.println(s);
        //đầu tiên phải dùng controller cho phép nó sử dụng 2 cái này
        //đây là mvc
        //còn ý e hỏi là như này bây h a demo
    }
}
