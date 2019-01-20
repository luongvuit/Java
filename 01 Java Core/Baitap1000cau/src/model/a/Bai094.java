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
public class Bai094 {

    public void tich94() {
        for (int i = 1; i < 100; i++) {
            if(i%2==1){
                if(i==5||i==7||i==93){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
    
}
