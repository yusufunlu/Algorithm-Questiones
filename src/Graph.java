import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * yusufu 1/17/2020 .
 */
public class Graph {

    static int tasks(int n, List<Integer> a, List<Integer> b) {

        for(int i = 0; i<n;i++) {
            System.out.println("For : "+ a.get(i) + "needs " + b.indexOf(a.get(i)));
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(4);

        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(4);
        int result = tasks(2,a,b);
        System.out.println(result);
    }
}
