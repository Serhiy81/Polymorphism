package app;

abstract class ProductCalc {

    String name;

    public ProductCalc(String name){
        this.name = name;
    }
    abstract  double calcSum();

    double calcCoef(){
        return 0;
    }


}
