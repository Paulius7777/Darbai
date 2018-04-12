import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulius on 2017.02.22.
 */
public class ShoppingBasket {
    private List<Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price) {
        boolean found = false;
        for (Purchase purchase : this.purchases) {
            if (purchase.Name().equals(product)) {
                purchase.increaseAmount();
                found = true;
            }
        }

        if (found == false) {
            this.purchases.add(new Purchase(product, 1, price));
        }
    }


    public int price(){
        int totalPrice = 0;
        for(Purchase price: purchases){
           totalPrice +=  price.price();
        }
        return totalPrice;
    }
    public void print(){
        for(Purchase product: this.purchases){
            System.out.println(product);
        }
    }
}
