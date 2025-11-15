/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuweb2;

/**
 *
 * @author Nine9
 */
public class NilaiAkhir {
    // metode proses
    public static double NilaiAkhir(double uts, double uas) {

        double hasil = (uts * 0.5) + (uas * 0.5); //37.5
        return hasil;
    }
// metode output
    public static void showData(String nmhs, String jk, double nuts, double nuas, double hasil, String nh, String kl) {
        System.out.println("Nama Mahasiswa = " + nmhs);
        System.out.println("Jenis Kelamin = " + jk);
        System.out.println("nilai UTS = " + nuts);
        System.out.println("nilai UAS = " + nuas);
        System.out.println("Nilaia Akhir = " + hasil);
        System.out.println("Nilai Huruf = " + nh);
        System.out.println("Keterangan = " + kl);

    }

//metode penentuan nilai huruf(a,b,c)
    public static String PenentuanNilaiHuruf(double nakhir) {

        String nhuruf;

        if (nakhir >= 80) {

            nhuruf = "A";
        } else if (nakhir >= 70) {

            nhuruf = "B";
        } else if (nakhir >= 60) {
            nhuruf = "C";
        } else {
            nhuruf = "D";
        }
        return nhuruf;
    }

//menentukan keterangan  
    public static String Keterangan(String nh) {

        String kalimat;

        if (nh == "A") {
            kalimat = "Sangat memuaskan";
        } else if (nh == "B") {
            kalimat = "Baik";
        } else if (nh == "C") {
            kalimat = "Cukup";
        } else {
            kalimat = "Belajar yang giat lagi";
        }
        return kalimat;

    }

// metode inputdata
    public static void inputData() {
        String nama, jk, nilaihuruf, ket;
        double nilaiUas, nilaiuts, hasil;

        nama = "dodi";
        jk = "PRIA";
        nilaiUas = 95; //75.0
        nilaiuts = 80; //95.0

        hasil = NilaiAkhir(nilaiuts, nilaiUas);
        nilaihuruf = PenentuanNilaiHuruf(hasil);
        ket = Keterangan(nilaihuruf);

        showData(nama, jk, nilaiUas, nilaiuts, hasil, nilaihuruf, ket);
    }

//metode main
    public static void main(String args[]) {

        inputData();
    }
}
