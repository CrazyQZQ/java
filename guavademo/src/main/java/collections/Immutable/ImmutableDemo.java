package collections.Immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;

public class ImmutableDemo {
    public static void main(String[] args) {
        ImmutableList<String> sss = ImmutableList.<String>builder().add("sss").build();
        sss.stream().forEach(System.out::println);
        ImmutableSortedSet.<String>of("a","b","c","s","a","d","d","c")
                .stream().forEach(System.out::print);
    }
}
