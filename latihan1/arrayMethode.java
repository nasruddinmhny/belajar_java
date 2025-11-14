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
public class arrayMethode {

    public static ArrayList<Integer> total(ArrayList<Integer> hrgb, ArrayList<Integer> qty) {

        ArrayList<Integer> hasil = new ArrayList<>();
        int n = Math.min(hrgb.size(), qty.size());
        
        for (int a = 0; a < n; a++) {
            
           int b =  hrgb.get(a) * qty.get(a);
           hasil.add(b);
        }
        
        return hasil;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        Scanner obj1 = new Scanner(System.in);

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Integer> harga = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();
        int n;

        System.out.println("Input Jumlah Data : ");
        n = scanner.nextInt();

        for (int a = 0; a < n; a++) {

            System.out.println("Input Nama : ");
            String namapel = obj.nextLine();
            nama.add(namapel);
            
            System.out.println("Input Harga : ");
            int hrg = obj.nextInt();
            harga.add(hrg);
            
            System.out.println("Input Jumlah: ");
            int jum = obj.nextInt();
            jumlah.add(jum);
            
            obj.nextLine();
        }
        
        ArrayList<Integer> totals = total(harga, jumlah);

        for (int a = 0; a < n; a++) {

            System.out.println("Nama : " + nama.get(a));
            System.out.println("Harga : " + harga.get(a));
            System.out.println("Qty : "+jumlah.get(a));
            System.out.println("Total : "+totals.get(a));
           

        }

    }
}
