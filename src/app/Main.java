package app;

public class Main {
    static String name;
    static double price;
    static double quantity;
    static double coefficient;
    static String roundSum;
    static String roundCoefficient;
    static String productData;

    public static void main(String[] args) {

        handleProductA();
        handleProductB();

    }
    private static void  handleProductA() {
    name = "Chip";
    price = 1000;
    quantity = 5;
    ProductServiceA service = new ProductServiceA(name,price,quantity);
    roundSum = Rounder.roundValue(service.calcSum());
    productData = " Device: " + name +"\n Cost GBP: " + roundSum;
    getOutput(productData);
    }
    private static void handleProductB(){
        name = "Monitor";
        price = 500;
        quantity = 2;
        coefficient = 4;
        ProductServiceB service = new ProductServiceB(name,price,quantity,coefficient);
        roundCoefficient = Rounder.roundValue(service.calcCoef());
        productData = " Device: " + name + "\n Cost GBP: " + roundCoefficient;
        getOutput(productData);

    }
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
