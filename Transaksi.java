// class Transaksi yang mewarisi class Nota untuk menggambarkan total bayar dan metode pembayaran
class Transaksi extends Nota {
    private double totalBayar;
    

    public Transaksi(int noFaktur, String namaPelanggan, Barang[] items, double totalBayar) {
        super(noFaktur, namaPelanggan, items);
        this.totalBayar = totalBayar;
    }

    public double getTotalBayar() {
        return totalBayar;
    }
}
