package chapters.chapter11.Interfaces;

public interface Product {

    double getPrice();

    void setPrice(double price);

    default String getBarcode() {
        return "No barcode available";
    }

}
