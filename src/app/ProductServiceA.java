package app;

public class ProductServiceA extends ProductCalc {

    double price;
    double quantity;

    public ProductServiceA(String name,double price,double quantity){
        super(name);
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    double calcSum(){return price  * quantity;
    }
}
