import java.util.HashSet;
import java.util.Set;

public class ExploreHashSet {

    public static void main(String[] args) {

        //stores value randomly
        //duplicates not allowed
        Set<Integer> set = new HashSet<>();

        set.add(100);
        set.add(200);
        set.add(001);
        set.add(52);
        set.add(100);

        System.out.println(set);

        set.remove(100);

        System.out.println(set);

        System.out.println(set.contains(1));

        System.out.println(set.size());

        System.out.println(set.isEmpty());

        set.clear();

        System.out.println(set);


    }
}
