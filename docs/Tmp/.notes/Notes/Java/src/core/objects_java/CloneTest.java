package core.objects_java;

public class CloneTest implements Cloneable {
    public byte[] a = {1, 2, 3, 4, 5};
    public byte[] b = {5, 4, 3, 2, 1};


    public CloneTest clone(){
        CloneTest that = null;
        try{
            that = (CloneTest)super.clone();        //Make a binary copy
            that.b = this.b.clone();                //Do customized operation
            return that;
        } catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args){
        CloneTest original = new CloneTest();
        CloneTest cloned = original.clone();

        original.a[0] = 10;
        System.out.println("original = " + original.a[0]);
        System.out.println("cloned = " + cloned.a[0]);

        System.out.println("(original.a == cloned.a) = " + (original.a == cloned.a));

        System.out.println("(original.b == cloned.b = " + (original.b == cloned.b));
        original.b[0] = 20;
        System.out.println("original.b[0] = " + original.b[0]);
        System.out.println("cloned.b[0] = " + cloned.b[0]);

    }
}