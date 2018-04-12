
public class Main {

    public static void main(String[] args) {
            Container container = new Container(1000);
            addSuitcasesFullOfBricks(container);
            System.out.println(container);
    }

        public static void addSuitcasesFullOfBricks(Container container) {
            int brickWheight = 1;
            while (brickWheight < 100){
                Thing brick = new Thing("Brick", brickWheight);
                Suitcase fullBricks = new Suitcase(100);
                fullBricks.addThing(brick);
                container.addSuitcase(fullBricks);
                brickWheight++;
            }
            container.getSuitcasesWheight();
        }

}
