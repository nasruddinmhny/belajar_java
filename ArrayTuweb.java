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
public class ArrayTuweb {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
     
        
        //String meja[] = new String[10];
        //String meja[] = {"Adi","adam","Alex","kamil","Rina","tina"};
        String meja[] = new String[5];
        for(int a = 0; a < meja.length; a++){
            
            System.out.println("Input Komputer = ");
            meja[a] = data.nextLine();
            
        }
        
        System.out.println("======= Menampilkan Nilai Dari Variabel Array =========");
        for(int a = 0; a < meja.length; a++){
            
            System.out.println("Data meja = ["+(a)+"] = "+meja[a]);
        }
        
        
        
        
        
        
        
    }
}
