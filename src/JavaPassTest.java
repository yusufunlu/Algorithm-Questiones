class Deneme {
    public int number = 0;

    public Deneme(int i) {
        number = i;
    }
}


public class JavaPassTest {

    private static void changePrimitive(int number) {
        number=2;
    }

    private static void changeInteger(Integer number) {
        number = 2;
    }

    private static void changeObject(Deneme number) {
        number.number = 2;
    }

    public static void main(String args[])
    {
        int a = 1;
        System.out.println("a: "+ a);
        changePrimitive(a);
        System.out.println("a: "+ a);

        int i = 1;
        System.out.println("i: "+ a);
        changePrimitive(i);
        System.out.println("i: "+i);

        Deneme o = new Deneme(1);
        System.out.println("o: "+ o.number);
        changeObject(o);
        System.out.println("o: "+ o.number);
    }
}
