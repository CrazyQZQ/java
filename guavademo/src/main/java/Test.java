import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayListMultimap<Object, Object> multimap = ArrayListMultimap.create();
        multimap.put("aa",1);
        multimap.put("aa",2);
        List<Object> aa = multimap.get("aa");
        aa.stream().forEach(System.out::println);
    }
}
