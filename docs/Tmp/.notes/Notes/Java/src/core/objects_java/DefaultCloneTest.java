package core.objects_java;

public class DefaultCloneTest implements  Cloneable {
    int[] arr_1 = {1, 2, 3};
    int anInt_1 = 1;

    public static void main(String[] args) throws CloneNotSupportedException {
        DefaultCloneTest dct_1 = new DefaultCloneTest();
        DefaultCloneTest dct_2 = (DefaultCloneTest) dct_1.clone();


        dct_1.anInt_1++;
        System.out.println("dct_2 = " + dct_2.anInt_1);
        dct_1.arr_1[0]++;
        System.out.println("dct_2 = " + dct_2.arr_1[0]);
    }
}
