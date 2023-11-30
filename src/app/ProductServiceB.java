package app;

public class ProductServiceB extends ProductCalc {

    double price;
    double quantity;
    double coefficient;

    public ProductServiceB(String name, double price, double quantity,
                           double coefficient){
        super(name);
        this.price = price;
        this.quantity = quantity;
        this.coefficient = coefficient;

    }
    double calcSum(){return price * quantity;}

    double calcCoef(){return (price + price) *coefficient ;}


}
