
import jdk.nashorn.internal.objects.NativeString;

import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> peoples = new HashMap<String, String>();
        peoples.put(NativeString.toLowerCase("matti"), "mage");
        peoples.put("mikael", "mixu");
        System.out.println(peoples.get("mikael"));
        peoples.put("arto", "arppa");


    }

}
