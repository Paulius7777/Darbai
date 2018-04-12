
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");

    }

    private static void printWithSmileys(String method) {
        String name = " " + method + " ";
        String smileys = ":)";
        if (name.length() % 2 == 1) {
            name += " ";
        }
        printLine(name, smileys);
        System.out.println(smileys + name + smileys);
        printLine(name, smileys);
    }

    private static void printLine(String name, String smileys) {
        for (int i = 0; i < name.length() + 4; i += 2) {
            System.out.print(smileys);
        }
        System.out.println();
    }
}

