package preconditions;

import com.google.common.base.Preconditions;

public class PreconditionsDemo {
    public static void test(Integer i){
        Preconditions.checkNotNull(i);
        Preconditions.checkArgument(i>0,"error: %s <= 0",i);
    }

    public static void main(String[] args) {
        test(null);
        test(-1);
    }
}
