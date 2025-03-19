public class main {
    public static void main(String[] args) {
        PetrolPurchase purchase = new PetrolPurchase(10, 1150, 13, "diesel", "mushin");
        double price = purchase.getPrice();
        int quantity = purchase.getQuantity();
        double discount = purchase.getDiscount();

        double total = purchase.getPurchaseAmount(quantity, price, discount);
        System.out.println("The total price is $" + total);


        Car car1 = new Car("Toyota", "2007", 3000);
        Car car2 = new Car("Lexus", "2015", -5000);
        double price1 = car1.getPrice();
        double price2 = car2.getPrice();
        double netPrice1 = car1.calculatePrice(price1, 7);
        double netPrice2 = car2.calculatePrice(price2, 5);
        System.out.println("The net price is $" + netPrice1);
        System.out.println("The net price is $" + netPrice2);


    }
}
