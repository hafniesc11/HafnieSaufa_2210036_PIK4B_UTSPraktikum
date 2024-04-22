/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Soal 2
Gunakan loop bersarang yang menampilkan pola (patterns) berikut dalam empat program terpisah.
 */

package utspraktikumpbo;

public class Soal2PolaC {
     public static void main(String[] args) {
       System.out.println("Pola Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
