package containers;

/**
 * Created by Paulius on 2017.10.15.
 */
public class ProductContainer extends Container {

    private String productName;


    public ProductContainer(String productName, double capacity) {
        super(capacity);

        this.productName = productName;

    }



    public String getName() {
        return productName;
    }

    public void setName(String newName){
        this.productName = newName;
    }

    public String toString(){
        return this.productName + ": "+ super.toString();
    }

}
