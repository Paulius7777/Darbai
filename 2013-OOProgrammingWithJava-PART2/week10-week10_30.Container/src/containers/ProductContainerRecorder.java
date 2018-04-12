package containers;

/**
 * Created by Paulius on 2017.10.17.
 */
public class ProductContainerRecorder extends ProductContainer {

        private ContainerHistory containerH;


    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.containerH = new ContainerHistory();
        this.addToTheContainer(initialVolume);

    }

    public String history(){
        return containerH.toString();
    }

    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.containerH.add(this.getVolume());
    }

    public double takeFromTheContainer(double amount){
        double firsVol = this.getVolume();
        super.takeFromTheContainer(amount);
        this.containerH.add(this.getVolume());
        return firsVol - this.getVolume();
    }


    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n"
        + "History: " + history() + "\n"
        + "Greatest product amount: " + containerH.maxValue() + "\n"
        + "Smallest product amount: " + containerH.minValue() + "\n"
        + "Average: " + containerH.average() + "\n"
        + "Greatest change: " + containerH.greatestFluctuation() + "\n"
        + "Variance: " + containerH.variance()
        );
    }
}
