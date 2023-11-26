import java.util.Scanner;
// driver class Minimarket
public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int noFaktur, jumlahBarang;
            String namaPelanggan, namaBarang;
            double hargaBarang, totalBayar;

            System.out.print("Masukkan No. Faktur: ");
            noFaktur = scanner.nextInt();

            System.out.print("Masukkan Nama Pelanggan: ");
            namaPelanggan = scanner.next();

            System.out.print("Masukkan Nama Barang: ");
            namaBarang = scanner.next();

            System.out.print("Masukkan Harga Barang: ");
            hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Barang: ");
            jumlahBarang = scanner.nextInt();

            totalBayar = hargaBarang * jumlahBarang;

            Barang[] items = new Barang[1];
            items[0] = new Barang(namaBarang, hargaBarang);

            Transaksi transaksi = new Transaksi(noFaktur, namaPelanggan, items, totalBayar);

            System.out.println("\nTransaksi:");
            System.out.println("No. Faktur: " + transaksi.getNoFaktur());
            System.out.println("Nama Pelanggan: " + transaksi.getNamaPelanggan());
            System.out.println("Detail Item: ");
            for (Barang item : transaksi.getItems()) {
                System.out.println(" - " + item.getName() + " @ " + item.getPrice());
            }
            System.out.println("Total Bayar: " + transaksi.getTotalBayar());
        }
    }
}
