/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Soal 3
(Integer Palindrome) Tulis metode dengan header berikut
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number)
    // Return true if number is a palindrome
    public static boolean isPalindrome(int number)
Gunakan metode reverse untuk mengimplementasikan isPalindrome. Suatu bilangan disebut palindrom
jika pembalikannya sama dengan bilangan itu sendiri. Tulis program pengujian yang meminta pengguna 
untuk memasukkan bilangan bulat dan melaporkan apakah bilangan bulat tersebut adalah palindrom.
 */

package utspraktikumpbo;

import java.util.Scanner;

public class Soal3IntegerPolindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " adalah bilangan palindrom.");
        } else {
            System.out.println(number + " bukan bilangan palindrom.");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
