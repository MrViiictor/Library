public class Book {
    private String title;
    private Author author;
    private double price;
    private int qtyInStock;
    public Book(String title, Author author, double price, int qtyInStock){

    }
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}
