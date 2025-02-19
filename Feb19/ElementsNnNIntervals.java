package Feb19;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ElementsNnNIntervals {
    public List<Integer> solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length)
                .filter(i -> i % n == 0)
                .mapToObj(i -> num_list[i])
                .collect(Collectors.toList());
    }
}
