import java.util.Scanner;

public class Gajikaryawan {
    
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Meminta input jumlah jam kerja
    System.out.println("Masukan jumlah jam kerja: ");
    int jamKerja = scanner.nextInt();
    

    //Meminta input tarif perjam
    System.out.println("Masukan tarif perjam");
    int tarifPerjam = scanner.nextInt();


    //Menghitung gaji karyawan
    int gajiKaryawan = jamKerja * tarifPerjam;


    //Menghitung potongan pajak
    double potonganPajak = gajiKaryawan  * 0.10;


    //Menghitung gaji bersih
    double gajiBersih = gajiKaryawan - potonganPajak;

    //Menampilkan hasil
    System.out.println("Gaji  Karyawan"+ gajiKaryawan);
    System.out.println("Potongan Pajak" + potonganPajak);
    System.out.println("Gaji Bersih" + gajiBersih);
    




    
        
        
    }
    
}
