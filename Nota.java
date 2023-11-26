// class Nota untuk menggambarkan No. Faktur, Nama Pelanggan, dan detail item yang dibeli
class Nota {
    private int noFaktur;
    private String namaPelanggan;
    private Barang[] items;

    public Nota(int noFaktur, String namaPelanggan, Barang[] items) {
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.items = items;
    }

    public int getNoFaktur() {
        return noFaktur;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public Barang[] getItems() {
        return items;
    }
}
