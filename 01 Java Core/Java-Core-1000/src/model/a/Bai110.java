/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.a;

/**
 *
 * @author Hoang Anh
 */
public class Bai110 {

    public void tich110() {
        int i,j,k;
        for (i = 0; i <= 200; i++) 
            for (j = 0; j <=100; j++) 
                for (k = 0; k <= 40; k++) 
                    if(i*1000+j*2000+k*5000==200000)
                    System.out.println(i + " to 1000 " + j + " to 2000 " + k + " to 5000");
                }             
}
