/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Informatika
 */
public class ArrayListg {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Scanner inputData = new Scanner(System.in);
        ArrayList<String> namaList = new ArrayList<>();
        int jumlahData;
        String nama;
        
        System.out.println("Input Jumlah Data : ");
        jumlahData = scanner.nextInt();
        
        for(int a = 0 ; a <= jumlahData;a++){
            
            System.out.println("Input nama ke "+(a+1)+"= ");
            nama = inputData.nextLine();
            namaList.add(nama);
        }
        
        for(String lisNama : namaList){
            System.out.println("list nama : "+lisNama);
        }
    }
}
