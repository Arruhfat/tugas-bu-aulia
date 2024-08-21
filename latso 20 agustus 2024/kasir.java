import java.util.Scanner;

public class kasir {

     public static void main(String[] args) {
        Double hargaAwal , presentaseDsikon , totalHarga;
        int jumlahbarang;

        Scanner scan = new Scanner (System.in);
        System.out.println("Masukan harga awal barang: ");
        hargaAwal = scan.nextDouble();
        System.out.println("Masukan presentase diskon: ");
        presentaseDsikon = scan.nextDouble();
        System.out.println("Masukan  jumlah barang: ");
        jumlahbarang = scan.nextInt();

        totalHarga = hargaAwal * jumlahbarang;
        presentaseDsikon=(presentaseDsikon/100)* totalHarga;
        totalHarga = totalHarga - presentaseDsikon;
        System.out.println("Harga ahkir barang setelah diskon: " +  totalHarga);



        
        
        
     }
}

    
    

