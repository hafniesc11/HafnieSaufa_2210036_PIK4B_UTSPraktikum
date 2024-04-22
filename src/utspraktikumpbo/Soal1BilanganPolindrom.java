/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Soal 1
Tulis sebuah program yang meminta pengguna untuk memasukkan bilangan bulat tiga digit dan menentukan 
apakah itu bilangan palindrom. Suatu bilangan disebut palindrom jika bacaannya sama dari kanan ke kiri dan dari kiri ke kanan.
 */

package utspraktikumpbo;

import java.util.Scanner;

public class Soal1BilanganPolindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan 3 digit bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan < 100 || bilangan > 999) {
            System.out.println("Bilangan harus terdiri dari 3 digit!");
            return;
        }
        
        int temp = bilangan;
        int bilanganTerbalik = 0;
        while (bilangan > 0) {
            int digitTerakhir = bilangan % 10;
            bilanganTerbalik = bilanganTerbalik * 10 + digitTerakhir;
            bilangan /= 10;
        }

        if (temp == bilanganTerbalik) {
            System.out.println(temp + " merupakan bilangan palindrome");
        } else {
            System.out.println(temp + " bukan bilangan palindrome");
        }
    }
}
