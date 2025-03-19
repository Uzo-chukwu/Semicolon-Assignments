public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double price;
    private double discount;

    public PetrolPurchase(double discount, double price, int quantity, String petrolType, String location) {
        this.discount = discount;
        this.price = price;
        this.quantity = quantity;
        this.petrolType = petrolType;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if(discount > 0) {
            this.discount = discount;
        }
    }

    public double getPurchaseAmount(int quantity, double price, double discount) {
        double grossTotal = price * quantity;
        double totalDiscount = (discount/100) * grossTotal;
        double netTotal = grossTotal -totalDiscount;
        return netTotal;
    }

}
