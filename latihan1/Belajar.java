/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;
import java.util.Scanner;
/**
 *
 * @author Informatika
 */
public class Belajar {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Scanner JumlahNama = new Scanner(System.in);
        String nama[] = new String[10];
        int jumlah=0;
        
        System.out.println("Input Jumlah Data : ");
        jumlah = data.nextInt();
        
        for(int a=0;a<jumlah;a++){
            
            System.out.println("Input Nama : ");
            nama[a] = JumlahNama.nextLine();
        }
        
        
        
    }
}
