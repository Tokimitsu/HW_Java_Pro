package _18_08_Summary;

import java.util.List;

public class OddEvenTask {
    public OddEven oddEvenPartition(List<Integer> inputList) {
        if (inputList.contains(null)){
            throw new IllegalArgumentException();
        }
        List<Integer> evenNums = inputList.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        List<Integer> oddNums = inputList.stream()
                .filter(x -> x % 2 != 0)
                .toList();
        return new OddEven(oddNums, evenNums);
    }
}
