package core.objects_java;

import java.util.Arrays;
import java.util.List;

public class CloneTestSuper implements Cloneable {
    int[] arr_1 = {1, 2, 3};
    List<String> strings = Arrays.asList("a", "b", "c");
    @Override public CloneTestSuper clone() {
        CloneTestSuper clone = null;
        try {
            clone = (CloneTestSuper) super.clone();
//            clone.strings = this.strings.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public static void main(String[] args) {
        CloneTestSuper cts = new CloneTestSuper();
        CloneTestSuper cts_clone = cts.clone();
        cts_clone.arr_1[0] = 100;
        System.out.println(cts.arr_1[0]);
        System.out.println(cts_clone.arr_1[0]);
        cts.strings.set(0, "d");
        System.out.println(cts.strings.get(0));
        System.out.println(cts_clone.strings.get(0));
    }
}
