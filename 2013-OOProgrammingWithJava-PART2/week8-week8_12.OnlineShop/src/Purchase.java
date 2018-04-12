/**
 * Created by Paulius on 2017.02.22.
 */
public class Purchase {
        private int amount;
        private int unitPrice;
        private String product;

    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    public String Name(){
        return this.product;
    }
    public int price(){
        int price = this.amount * this.unitPrice;
        return price;
    }
    public void increaseAmount(){
        this.amount++;
    }
    public String toString(){
        return product + ": " + this.amount;
    }
}
