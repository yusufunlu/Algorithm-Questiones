import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// @author yusufu
public class SearchSuggestions {

    /*
    abbS abc
    abbS
    */
    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        // Write your code here


        List<String> sorted = repository.stream().sorted().collect(Collectors.toList());
        List<List<String>> results = new ArrayList<>();



        int len = customerQuery.length();
        for(int i=2;i<=len;i++){
            int finalI = i;
            System.out.println("i:"+ i);
            String part = customerQuery.substring(0, i);
            List<String> alist = sorted.stream().filter(word -> word.length()>=finalI && word.substring(0,finalI).equals(part) ).limit(3)
                    .collect(Collectors.toList());
            results.add(alist);

        }

        return results;
    }
}
