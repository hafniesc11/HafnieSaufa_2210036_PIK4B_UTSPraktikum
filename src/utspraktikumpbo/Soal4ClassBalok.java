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

public class Soal4ClassBalok {
    int panjang;
    int lebar;
    int tinggi;
    
    public Soal4ClassBalok(int panjangBaru, int lebarBaru, int tinggiBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }
    
    public int getLuas() {
         return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    public int getKeliling() {
    return 4 * (panjang + lebar + tinggi);
  }

  public int getVolume() {
    return panjang * lebar * tinggi;
  }
  
  // setter methods
  public void setPanjang(int panjangBaru) {
    this.panjang = panjangBaru;
  }

  public void setLebar(int lebarBaru) {
    this.lebar = lebarBaru;
  }

  public void setTinggi(int tinggiBaru) {
    this.tinggi = tinggiBaru;
  }
  
}

