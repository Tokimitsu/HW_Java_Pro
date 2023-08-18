package _18_08_Summary;

import java.util.ArrayList;
import java.util.List;

public class OddEven {
    private List<Integer> oddNums;
    private List<Integer> evenNums;

    public OddEven(List<Integer> oddNums, List<Integer> evenNums) {
        this.oddNums = oddNums;
        this.evenNums = evenNums;
    }

    public List<Integer> getOddNums() {
        return oddNums;
    }

    public List<Integer> getEvenNums() {
        return evenNums;
    }
}
