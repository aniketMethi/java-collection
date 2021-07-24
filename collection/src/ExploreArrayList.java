import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExploreArrayList {

    public static void main(String[] args) {

//      suppose  size = n
//      after filing size willbe = n+ n/2 +1

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       /*
        System.out.println(list);

        list.add(5); //this will add at the end of the list

        System.out.println(list);

        list.add(1,0);
        System.out.println(list);

        List<Integer> newlist = new ArrayList<>();
        newlist.add(1);
        newlist.add(2);
        newlist.add(3);
        newlist.add(4);

        list.addAll(newlist);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(2));
        System.out.println(list);

        list.set(1,2);
        System.out.println(list);

        System.out.println(list.contains(5));
        */


        for(int i =0; i<list.size(); i++){
            System.out.println("the element is "+list.get(i));
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("value ="+ it.next());
        }
    }
}
