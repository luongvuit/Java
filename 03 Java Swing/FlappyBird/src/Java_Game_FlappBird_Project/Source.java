/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Game_FlappBird_Project;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author LUONG VU
 */
public class Source {
    private static int source = 0;
    private Bird bird = new Bird();
    private Cylinder cylinder = new Cylinder();
    private static boolean bl1 = false;
    private static boolean bl2 = false;
    private static boolean bl3 = false;
    private static boolean bl4 = false;

    //Source
    public static int getSource() {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("source.txt");
            FileWriter fw = new FileWriter(f);

            //Bước 2: Ghi dữ liệu
            String s = String.valueOf("Điểm số: " +source);
            fw.write(s);

            //Bước 3: Đóng luồng
            fw.close(); 
          } catch (IOException ex) {
           
        }
        return source;
    }

    
    public void addSource() {
        //qua ong nuoc thu 1
        if (bird.getX() + 45 > cylinder.getX1() && bird.getX() < cylinder.getX1() + 65) {
            bl1 = true;
        }
        
        if (bl1 == true && bird.getX() > cylinder.getX1() + 65) {
            source++;
            bl1 = false;
        }
        
        //qua ong nuoc thu 2
        if (bird.getX() + 45 > cylinder.getX2() && bird.getX() < cylinder.getX2() + 65) {
            bl2 = true;
        }
        
        if (bl2 == true && bird.getX() > cylinder.getX2() + 65) {
//            diem = diem +1;
            source++;
            bl2 = false;
        }
        //qua ong nuoc thu 3
        if (bird.getX() + 45 > cylinder.getX3() && bird.getX() < cylinder.getX3() + 65) {
            bl3 = true;
        }
        if (bl3 == true && bird.getX() > cylinder.getX3() + 65) {
//            diem = diem +1;
            source++;
            bl3 = false;
        }
        //qua ong nuoc thu 4
        if (bird.getX() + 45 > cylinder.getX4() && bird.getX() < cylinder.getX4() + 65) {
            bl4 = true;
        }
        if (bl4 == true && bird.getX() > cylinder.getX4() + 65) {
//            diem = diem +1;
            source++;
            bl4 = false;
        }
    }
}
