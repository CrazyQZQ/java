package collections.multiset;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.List;

public class MultisetDemo {
    public static void main(String[] args) {
//      ################# HashMultiset ############################
//        HashMultiset<String> hashMultiset = HashMultiset.<String>create();
//        hashMultiset.add("aaa");
//        hashMultiset.add("bbb");
//        hashMultiset.add("ccc");
//        hashMultiset.add("aaa");
//        System.out.println(hashMultiset.count("aaa"));
//        hashMultiset.setCount("bbb", 5);
//        hashMultiset.stream().forEach(System.out::println);
//        System.out.println("------------------------");
//        hashMultiset.entrySet().stream().forEach(System.out::println);
//      ################# Multimap ############################
        ArrayListMultimap<String, Integer> listMultimap = ArrayListMultimap.<String, Integer>create();
        listMultimap.put("a",1);
        listMultimap.put("a",2);
        listMultimap.put("a",3);
        listMultimap.put("a",4);
        listMultimap.put("b",1);
        List<Integer> list = listMultimap.get("a");
        System.out.println(list.size());
        list.forEach(System.out::print);
        System.out.println(listMultimap);
    }
}
