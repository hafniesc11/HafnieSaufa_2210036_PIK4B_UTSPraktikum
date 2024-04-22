/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B

Soal 4 : 
Buatlah kelas Balok dan kelas Main untuk testernya sesuai dengan ketentuan pada
gambar diagram kelas tersebut, dengan rumus balok :
1) Luas balok: L = 2 x [(p x l) + (p x t) + (l x t)]
2) Keliling balok: K = 4 x (p + l + t)
3) Volume balok: V = p x l x t
 */

package utspraktikumpbo;

public class Soal4MainBalok {
    public static void main(String[] args) {
    Soal4ClassBalok balok1 = new Soal4ClassBalok(1, 1, 1);
    Soal4ClassBalok balok2 = new Soal4ClassBalok(30, 40, 50);
    Soal4ClassBalok balok3 = new Soal4ClassBalok(25, 35, 45);

    System.out.println("Balok dengan panjang " + balok1.panjang + ", lebar: " + balok1.lebar + " dan tinggi: " + balok1.tinggi + 
            ". Luasnya: " + balok1.getLuas() + ", sedangkan kelilingnya " + balok1.getKeliling() + " dan volumenya: " + balok1.getVolume());

    System.out.println("Balok dengan panjang " + balok2.panjang + ", lebar: " + balok2.lebar + " dan tinggi: " + balok2.tinggi + 
            ". Luasnya: " + balok2.getLuas() + ", sedangkan kelilingnya " + balok2.getKeliling() + " dan volumenya: " + balok2.getVolume());

    System.out.println("Balok dengan panjang " + balok3.panjang + ", lebar: " + balok3.lebar + " dan tinggi: " + balok3.tinggi + 
            ". Luasnya: " + balok3.getLuas() + ", sedangkan kelilingnya " + balok3.getKeliling() + " dan volumenya: " + balok3.getVolume());
  }
    }
