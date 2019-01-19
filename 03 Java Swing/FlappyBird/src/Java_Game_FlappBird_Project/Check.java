/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Game_FlappBird_Project;

/**
 *
 * @author LUONG VU
 */
public class Check {
    private Bird bird = new Bird();
    private Cylinder cylinder = new Cylinder();

    public boolean die() {
        //Chim chạm đất
        if (bird.getY() + 45 >= 400) {
            return true;
        }

        
        if (bird.getY() <= cylinder.getH1() && (((bird.getX() + 45) >= cylinder.getX1())) && bird.getX() <= (cylinder.getX1() + 65)) {
            return true;
        }
        if ((bird.getY() + 45) >= (cylinder.getH1() + 100) && ((bird.getX() + 45) >= cylinder.getX1() && bird.getX() <= (cylinder.getX1() + 65))) {
            return true;
        }
        //--------
        if (bird.getY() <= cylinder.getH2() && (((bird.getX() + 45) >= cylinder.getX2())) && bird.getX() <= (cylinder.getX2() + 65)) {
            return true;
        }
        if ((bird.getY() + 45) >= (cylinder.getH2() + 100) && ((bird.getX() + 45) >= cylinder.getX2() && bird.getX() <= (cylinder.getX2() + 65))) {
            return true;
        }
        //--------
        if (bird.getY() <= cylinder.getH3() && (((bird.getX() + 45) >= cylinder.getX3())) && bird.getX() <= (cylinder.getX3() + 65)) {
            return true;
        }
        if ((bird.getY() + 45) >= (cylinder.getH3() + 100) && ((bird.getX() + 45) >= cylinder.getX3() && bird.getX() <= (cylinder.getX3() + 65))) {
            return true;
        }
        //--------
        if (bird.getY() <= cylinder.getH4() && (((bird.getX() + 45) >= cylinder.getX4())) && bird.getX() <= (cylinder.getX4() + 65)) {
            return true;
        }
        if ((bird.getY() + 45) >= (cylinder.getH4() + 100) && ((bird.getX() + 45) >= cylinder.getX4() && bird.getX() <= (cylinder.getX4() + 65))) {
            return true;
        }
        return false;
    }
}
