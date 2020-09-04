package optional;


import com.google.common.base.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
//        Optional<String> op = Optional.of("sss");
//        System.out.println(op.asSet());
//        System.out.println(op.isPresent());
//        System.out.println(op.equals("sss"));
//        System.out.println(op.get());
//        System.out.println(op.or("str"));
        System.out.println(Optional.of(null).or("sss"));

    }
}
