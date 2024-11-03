/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author nadhif
 */
public class BMIoperation {
    int bb;
    int tb;
    
    public BMIoperation(int tb, int bb) {
        this.bb = bb;
        this.tb = tb;
    }
    
    public void hitungBMI(){
        double hasil = bb / Math.pow(tb / 100.0, 2);
        System.out.println("Hasil kalkulasi dari tinggi bandan " + tb + " dan berat badan " + bb);
        if(hasil < 18.5){
            System.out.println("Adalah "+ hasil +" berat badan anda kurang atau kurus");
        } else if(hasil >= 18.5 && hasil <= 22.9){
            System.out.println("Adalah "+ hasil +" bagus! berat badan anda ideal");
        } else if(hasil >= 23 && hasil <= 24.9){
            System.out.println("Adalah "+ hasil +" berat badan anda obesitas");
        } else if(hasil >= 25 && hasil <= 29.9){
            System.out.println("Adalah "+ hasil +" anda harus segera diet!");
        }
    }
}
