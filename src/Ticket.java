public class Ticket {
    private int item, family, lineScale, lineVendor;
    private float  weight, price, amount, baseAmount;
    private String name;

    public Ticket(int item, String name, int family, int lineScale, int lineVendor, float weight, float price, float amount, float baseAmount ){
        this.item = item;
        this.name = name;
        this.family = family;
        this.lineScale = lineScale;
        this.lineVendor = lineVendor;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
        this.baseAmount = baseAmount;
    }

    public Ticket(float amount){
        this.amount = amount;
    }

    public Ticket() {

    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFamily() {
        return family;
    }

    public void setFamily(int family) {
        this.family = family;
    }

    public int getLineScale() {
        return lineScale;
    }

    public void setLineScale(int lineScale) {
        this.lineScale = lineScale;
    }

    public int getLineVendor() {
        return lineVendor;
    }

    public void setLineVendor(int lineVendor) {
        this.lineVendor = lineVendor;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(float baseAmount) {
        this.baseAmount = baseAmount;
    }

    public void printTicket(){
        System.out.println("Item: " + getItem());
        System.out.println("Name: " + getName());
        System.out.println("Family: " + getFamily());
        System.out.println("Line Scale: " + getLineScale());
        System.out.println("Line Vendor: " + getLineVendor());
        System.out.println("Weight: " + getWeight());
        System.out.println("Price: " + getPrice());
        System.out.println("Amount: " + getAmount());
        System.out.println("Base Amount: " + getBaseAmount());
    }
}
