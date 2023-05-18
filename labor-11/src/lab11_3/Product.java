package lab11_3;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int amount;
    private int price;

    public Product(int id, String name, int amount, int price){
        this.id=id;
        this.amount=amount;
        this.name=name;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void increaseAmount(int newAmount){
        amount += newAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int compareTo(Product that) {
        return this.id - that.id;
    }
}