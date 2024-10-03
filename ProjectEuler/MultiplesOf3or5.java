import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplesOf3or5 {
    public static void main(String[] args) {
        ArrayList<Integer> multiples = new ArrayList<>();

        for (int i = 999; i>= 1; i--) {
            if (i%3 == 0 || i%5 == 0)
                multiples.add(i);
        }

        Integer sum = multiples.stream()
                .reduce(0, Integer::sum);

        System.out.println("La suma es: " + sum);
    }
}
