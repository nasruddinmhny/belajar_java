/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuweb2;

import java.util.Scanner;

/**
 *
 * @author Nine9
 */
public class Belajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String hewanMamalia = "Kucing";
        //System.out.println("Nama  = "+hewanMamalia);
        
        //int Angka = 45;
        //System.out.println("Nilai variabel Angka = "+Angka+ " adalah bilangan bulat");
        double angka;
        String kalimat;
       
        
        System.out.println("Input Bilangan Decimal = ");
        angka = input.nextDouble();
        
        if (angka % 2 == 0){
            kalimat = "Genap";
        }else{
            kalimat = "Ganjil";
        }
        
        System.out.println("Angka yang anda input adalah = "+angka+" merupakan bilangan "+kalimat);
        
        
         
        
        
        
        
    }
}
