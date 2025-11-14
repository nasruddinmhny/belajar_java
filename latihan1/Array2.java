/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Informatika
 */
import java.util.Scanner;
public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] negara = new String[2][5];
        System.out.println("Silahkan masukkan nama negara yang anda ingin input!");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    System.out.print("Masukkan nama negara ke[" + (i + 1) + "][" + (j + 1) + "]:");
                    negara[i][j] = input.nextLine();
                } else {
                    System.out.print("Masukkan nama ibukota negara ke[" + (i) + "][" + (j + 1) + "]:");
                    negara[i][j] = input.nextLine();
                }
            }
        }
        
        System.out.println("\n====================================");
        System.out.println("Daftar Negara");
        System.out.println("=====================================");
        for(int j=0; j<5;j++){
            System.out.println("Negara : "+negara[0][j] + "| Ibu Kota: "+ negara[1][j]);
        }
    }
}
