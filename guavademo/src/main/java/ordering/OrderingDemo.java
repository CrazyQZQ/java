package ordering;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.checkerframework.checker.units.qual.A;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OrderingDemo {
    public static void main(String[] args) {
        ArrayList<String> list = Lists.newArrayList("eee", "bbb", "ccc",null);
        Ordering<Comparable> natural = Ordering.natural();
        List<String> strings = natural.reverse().nullsFirst().nullsLast().sortedCopy(list);
        strings.forEach(System.out::println);
        System.out.println(natural.max("asd", "s"));
    }
}
