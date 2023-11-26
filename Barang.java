// class Barang yang mengimplementasikan interface Item
class Barang implements Item {
    private String name;
    private double price;

    public Barang(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
