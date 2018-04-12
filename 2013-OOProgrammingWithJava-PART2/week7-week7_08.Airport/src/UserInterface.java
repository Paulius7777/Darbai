import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Paulius on 2017.02.12.
 */
public class UserInterface {
    private Scanner reader;
    private HashMap<String, String> planes;
    private ArrayList<String> flights;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.planes = new HashMap<String, String>();
        this.flights = new ArrayList<String>();
    }

    public void start() {
        airporpanel();
        flightservice();
    }
    private void addflitght() {
        System.out.println("Give plane ID:");
        String idp = reader.nextLine();
        System.out.println("Give departure airport code:");
        String departure = reader.nextLine();
        System.out.println("Give destination airport code:");
        String destination = reader.nextLine();
        String fl = idp + " (" + planes.get(idp) + " ppl)" + " (" + departure + "-" + destination + ")";
        flights.add(fl);

    }

    private void flightservice() {
        System.out.println("Flight service");
        System.out.println("------------");
        while (true) {
            System.out.println("Choose operation:" + "\n" +
                    "[1] Print planes" + "\n" +
                    "[2] Print flights" + "\n" +
                    "[3] Print plane info" + "\n" +
                    "[x] Quit" );
            String command = reader.nextLine();
            if (command.equals("1")) {
                                  printPlanes();
            } else if (command.equals("2")) {
                                 printFlights();
            } else if (command.equals("3")) {
                                 printPlaneInfo();
            } else if (command.equals("x")) {
                break;
            }
        }

    }

    private void printPlaneInfo() {
        System.out.println("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.println(planeID + " (" + planes.get(planeID)+" ppl)");
    }

    private void printFlights() {
        for(String fla : flights){
            System.out.println(fla);
        }
    }

    public void printPlanes() {
        for(String key: planes.keySet()){
            System.out.println( key+" (" + planes.get(key) + " ppl)");
        }
    }

    public void airporpanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        while (true) {
            System.out.println("Choose operation:" + "\n" +
                    "[1] Add airplane" + "\n" +
                    "[2] Add flight" + "\n" +
                    "[x] Exit");
            String command = reader.nextLine();
            if (command.equals("1")) {
                addPlane();
            } else if (command.equals("2")) {
                addflitght();
            } else if (command.equals("x")) {
                break;
            }
        }
    }
    public void addPlane(){
        System.out.println("Give plane ID:");
        String id = reader.nextLine();
        System.out.println("Give plane capacity:");
        String capacity = reader.nextLine();
        planes.put(id, capacity);
    }
}
