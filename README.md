# SIBETA_3

# Jobsheet 11 OOP POLYMORFISME

SCREEN SHOOT HASIL

- heterogenous
![alt text](https://github.com/rankadian/SIBETA_3/tree/main/OOP-JOBSHEET10/SCREENSHOOT?raw=true)
- object casting

- polymorphic

- Pertanyaan:
1. Apakan upcasting dapat dilakukan dari suatu class terhadap class lain yang tidak memiliki relasi inheritance?
- Jawab :
    Tidak, upcasting hanya dapat dilakukan antara dua kelas yang memiliki relasi inheritance (pewarisan). Artinya, upcasting hanya berlaku ketika sebuah kelas merupakan subclass dari kelas lain, atau keduanya memiliki hubungan pewarisan melalui hierarki kelas yang sama.
2. Dari 2 baris kode program berikut, manakan proses upcasting yang tepat? Jelaskan
Pegawai pegawai1 = new Dosen();
Pegawai pegawai1 = (Pegawai) new Dosen();
- Jawab :
    Dari kedua kode program tersebut proses Upcasting yang paling tepat adalahh terletak pada proses pertama
    karena,  pada baris ini, proses upcasting dilakukan secara implisit atau secara otomatis,
    tanpa harus dituliskan, Dosen adalah subclass dari pegawai sehingga kita bisa membuat object dosen 
    dan menyimpan nya ke variable bertipe pegawai, java akan otomatis melakukan upcasting.
3. Apa fungsi dari keyword instanceOf?
- Jawab :
    Keyword instanceof berfungsi untuk memeriksa apakah suatu objek termasuk dalam kelas tertentu. Kata kunci ini akan mengembalikan nilai true jika objek tersebut merupakan instance dari kelas, dan false jika bukan, Kata kunci instanceof juga dikenal sebagai operator perbandingan tipe karena membandingkan instance dengan tipe.
4. Apa yang dimaksud heterogenous collection?
- Jawab :
    Heterogeneous collection merujuk pada koleksi data yang berisi elemen-elemen dengan tipe yang berbeda atau bervariasi. Dalam konteks pemrograman, koleksi ini dapat menyimpan objek atau nilai yang berasal dari berbagai jenis tipe data yang berbeda (misalnya, tipe data yang tidak terhubung oleh pewarisan atau antarmuka yang sama).
5. Sebuah object diinstansiasi dari class Pegawai. Kemudian dilakukan downcasting menjadi object bertipe Dosen. Apakah hal ini dapat dilakukan? Lakukan percobaan untuk membuktikannya.
- Jawab :
    Bisa, jika objek tersebut memiliki relasi pewarisan, yaitu " Dosen harus merupakan subclass dari Pegawai"
- Implementasi Kode program :

    class Pegawai {
    public void bekerja() {
        System.out.println("Pegawai bekerja");
        }
    }

    class Dosen extends Pegawai {
    public void mengajar() {
        System.out.println("Dosen mengajar");
         }
    }

    public class Main {
        public static void main(String[] args) {
        // Instansiasi objek Pegawai yang sebenarnya bertipe Dosen
        Pegawai pegawai = new Dosen();
        
        // Melakukan downcasting ke tipe Dosen
        if (pegawai instanceof Dosen) {
            Dosen dosen = (Dosen) pegawai; // downcasting
            dosen.mengajar(); // Memanggil metode yang hanya dimiliki Dosen
        } else {
            System.out.println("Tidak dapat melakukan downcasting");
        }

        // Percobaan dengan objek yang bukan tipe Dosen
        Pegawai pegawaiLain = new Pegawai();
        try {
            Dosen dosenLain = (Dosen) pegawaiLain; // mencoba downcasting
            dosenLain.mengajar();
         } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
         }
        }
    }




