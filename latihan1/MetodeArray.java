/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Informatika
 */
public class MetodeArray {
    
    public static int input(int[] tempat){
        
        int hasil = 0;
        for(int a=0;a < tempat.length;a++){
            
            hasil+= tempat[a];
            
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        
        int tampung[] = {10,12,2,3,41};
        
        System.out.println("Hasil Jumlah = "+input(tampung));
    }
}
