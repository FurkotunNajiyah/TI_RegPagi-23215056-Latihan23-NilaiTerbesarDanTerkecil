/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 * Nama: Siti Furkotun Najiyah
 * NIM: 23215056
 * PRODI: Teknik Informatika
 */
import java.util.Scanner;

public class TerbesarTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama petugas: ");
        String namaPetugas = scanner.nextLine();

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTerbesar) {
                nilaiTerbesar = nilai;
            }
            if (nilai < nilaiTerkecil) {
                nilaiTerkecil = nilai;
            }
        }

        System.out.println("\nHasil Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + ": " + nilaiMahasiswa[i]);
        }
        System.out.println("Nilai terbesar adalah: " + nilaiTerbesar);
        System.out.println("Nilai terkecil adalah: " + nilaiTerkecil);
        System.out.println("Petugas: " + namaPetugas);
    }
}