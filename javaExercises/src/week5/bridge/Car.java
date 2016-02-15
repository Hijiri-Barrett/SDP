package week5.bridge;

/**
 * Created by Hijiri on 15/02/2016.
 */
abstract class Car {

    protected Product product;
    protected String detail;

    public Car(Product product, String detail) {
        this.product = product;
        this.detail = detail;
    }

    public void produceProduct() {
        String productDetail = product.getDetail();

        System.out.println("Productin " + productDetail);
        System.out.println("Modifying product " + productDetail + " accprding to " + detail + " model");
    }

    public void assemble() {

        System.out.println("Assembling " + product.getDetail() + " for " + detail + " model");
    }

    public void printDetails() {

        System.out.println("Car: " + detail + " model, Product: " + product.getDetail());
    }
}
