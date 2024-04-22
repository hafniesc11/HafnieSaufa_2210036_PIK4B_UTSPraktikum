/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Soal 2
Gunakan loop bersarang yang menampilkan pola (patterns) berikut dalam empat program terpisah:
 */

package utspraktikumpbo;

public class Soal2PolaB {
     public static void main(String[] args) {
       System.out.println("Pola Pattern B");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
