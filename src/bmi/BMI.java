package bmi;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di Calculator BMI!");
        System.out.print("Masukan tinggi badan anda (cm) : ");
        int tb = in.nextInt();
        System.out.print("Masukan berat badan anda (kg) : ");
        int bb = in.nextInt();
        BMIoperation hitungBMI = new BMIoperation(tb, bb);
        hitungBMI.hitungBMI();
    }
    
}
