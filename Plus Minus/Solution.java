import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i : arr) {
            if (i > 0) {
                pos += 1;
            } else if (i < 0) {
                neg += 1;
            } else {
                zero += 1;
            }
        }
        System.out.printf("%.6f\n", (double) pos / arr.size());
        System.out.printf("%.6f\n", (double) neg / arr.size());
        System.out.printf("%.6f\n", (double) zero / arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}