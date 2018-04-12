import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Paulius on 2017.09.16.
 */
public class RingingCentre {

    private Map<Bird, List<String>> map = new HashMap<Bird, List<String>>();



    public void observe(Bird bird, String place) {
        if(!map.containsKey(bird)){
            map.put(bird, new ArrayList<String>());
        }
            map.get(bird).add(place);

    }

    public void observations(Bird bird) {
        if(!map.containsKey(bird)){
            System.out.println(bird + " observations: 0");
        }else{
            System.out.println(bird + " observations: " + map.get(bird).size());
            for(String s: map.get(bird)){
                System.out.println(s);
            }
        }
    }
}
