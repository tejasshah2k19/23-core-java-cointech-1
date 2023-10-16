public class Order {
    Product product; // null
    Customer customer;// null
    float totalAmount;
    int qty;

    void addOrder(Product p, Customer c, int q) {
        totalAmount = p.price * q;
        qty = q;
        product = p;
        customer = c;
    }
}
// type
// primitive
// boolean byte short char int long float double
// non primitive
// class object array enum