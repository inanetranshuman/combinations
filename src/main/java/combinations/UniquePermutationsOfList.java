package combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UniquePermutationsOfList {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList();
        numList.add(1);
        numList.add(2);
        numList.add(1);

        Map<Integer, Integer> numCounter = new HashMap<Integer, Integer>();
        for(Integer num : numList) {
            if(!numCounter.containsKey(num)) {
                numCounter.put(num, 0);
            }

            numCounter.put(num, numCounter.get(num) + 1);
        }
        uniquePermutations(new LinkedList(), numCounter, numList.size());
    }

    private static void uniquePermutations(LinkedList<Integer> numList, Map<Integer, Integer> numCounter, int size) {
        if(numList.size() == size) {
            System.out.println(Arrays.toString(numList.toArray()));
            return;
        }

        for(Map.Entry<Integer, Integer> entry : numCounter.entrySet()) {
            Integer num = entry.getKey();
            Integer count = entry.getValue();

            if(count == 0) continue;

            numList.addLast(num);
            numCounter.put(num, count - 1);
            uniquePermutations(numList, numCounter, size);
            numList.removeLast();
            numCounter.put(num, count);
        }

    }
}
