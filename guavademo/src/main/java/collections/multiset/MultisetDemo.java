package collections.multiset;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class MultisetDemo {
    public static void main(String[] args) {
//      ################# HashMultiset ############################
        HashMultiset<String> hashMultiset = HashMultiset.<String>create();
        hashMultiset.add("aaa");
        hashMultiset.add("bbb");
        hashMultiset.add("ccc");
        hashMultiset.add("aaa");
        System.out.println(hashMultiset.count("aaa"));
        hashMultiset.setCount("bbb", 5);
        hashMultiset.stream().forEach(System.out::println);
        System.out.println("------------------------");
        hashMultiset.entrySet().stream().forEach(System.out::println);
//      ################# HashMultiset ############################


    }
}
