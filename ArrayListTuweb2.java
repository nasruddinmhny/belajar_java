/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuweb2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Nine9
 */
public class ArrayListTuweb2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in );
        ArrayList<String> meja = new ArrayList<>();
        
        //meja.add("Komp1");
        //meja.add("komp2");
        //meja.add("Komp3");
        
        int jumlahData;
        String NamaBarang;
        
        System.out.println("Input Jumlah Data : ");
        jumlahData = data.nextInt();
        data.nextLine();
        
        for(int a=0; a < jumlahData; a++){
            
            //System.out.println("Nilai Meja elemen ke  ["+(a)+"] = "+meja.get(a));
            System.out.println("Input Data komputer = ");
            NamaBarang =  data.nextLine();
            
            meja.add(NamaBarang);
        }
        
        System.out.println("==== Data Komputer ===");
        for(String dataKOmputer : meja){
            
            System.out.println(dataKOmputer);
        }
        
        String nama[][]; 
    }
 
}
