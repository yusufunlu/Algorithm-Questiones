package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

// @author yusufu
public class EvaluateDivision {

    public static void main(String[] args){


        List<List<String>> equations = new ArrayList<List<String>>();
        equations.add(Arrays.asList("a","b"));
        equations.add(Arrays.asList("b","c"));

        double[] values = {2.0,3.0};

        List<List<String>> queries = new ArrayList<List<String>>();
        queries.add(Arrays.asList("a","c"));
        queries.add(Arrays.asList("b","a"));
        queries.add(Arrays.asList("a","e"));
        queries.add(Arrays.asList("a","a"));



        calcEquation(equations, values, queries);


    }


    public static double[] calcEquation(List<List<String>> equations,
                                 double[] values, List<List<String>> queries) {

        HashMap<String, HashMap<String, Double>> map = new HashMap<>(); //nested hashmap
        for (int i = 0; i < values.length; i++){ //build the graph
            List<String> e = equations.get(i);
            map.computeIfAbsent(e.get(0), o -> new HashMap<>()).put(e.get(1), values[i]);
            map.computeIfAbsent(e.get(1), o -> new HashMap<>()).put(e.get(0), 1/values[i]);
        }

        double[] ans = new double[queries.size()];
        int idx = 0;
        for (List<String> q : queries)
            ans[idx++] = find(map, q.get(0), q.get(1), new HashSet<>(), 1);

        return ans;
    }

    private static double find(Map<String, HashMap<String, Double>> map,
                        String start, String target, HashSet<String> seen, double w){ //store the weight with the method
        if (!map.containsKey(start) || seen.contains(start)) return -1;
        if (start.equals(target)) return w;

        seen.add(start); // mark visited
        double ans = 1;
        for (String next : map.get(start).keySet()){
            double result = find(map, next, target, seen, map.get(start).get(next));
            if (result != -1) return result*w; // result found, return result*w.
        }

        return -1;
    }
}
