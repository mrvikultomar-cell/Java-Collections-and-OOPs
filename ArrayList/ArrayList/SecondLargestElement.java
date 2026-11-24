import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 20, 40, 30));

        Integer first = null;
        Integer second = null;

        for (int num : list) {
            if (first == null || num > first) {
                if (first != null && num != first) {
                    second = first;
                }
                first = num;
            } else if (num != first && (second == null || num > second)) {
                second = num;
            }
        }

        System.out.println(second == null ? -1 : second);
    }
}
