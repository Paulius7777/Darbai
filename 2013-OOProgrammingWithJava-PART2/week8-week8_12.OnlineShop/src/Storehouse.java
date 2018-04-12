import java.util.*;

/**
 * Created by Paulius on 2017.02.21.
 */
public class Storehouse {

    private Map<String, Integer> store = new HashMap<String, Integer>();
    private Map<String, Integer> storeStock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        store.put(product, price);
        storeStock.put(product, stock);
    }

    public int price(String product){
        if(store.containsKey(product)){
            return store.get(product);
        }
            return -99;
    }

    public int stock(String product) {
            if(storeStock.containsKey(product)){
                return storeStock.get(product);
            }
                return 0;
    }

    public boolean take(String product) {
            if(storeStock.containsKey(product) && storeStock.get(product) > 0){
                int stoks =  storeStock.get(product);
                stoks--;
                storeStock.replace(product,stoks);
                return true;
            }
        return false;
    }
    public Set<String> products(){
        Set<String> products = new HashSet<String>();
            for(String key: storeStock.keySet()){
                products.add(key);
              }

              return products;
    }
}
