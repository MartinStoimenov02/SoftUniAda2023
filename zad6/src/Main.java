import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Integer> list = Arrays.stream(str.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = Integer.MIN_VALUE, currentSum = 0;
        int start = 0, end = 0, current = 0;
        for(int i = 0; i < list.size(); i++){
            currentSum += list.get(i);

            if (currentSum > sum) {
                sum = currentSum;
                start = current;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                current = i + 1;
            }
        }
        System.out.println(sum + " " + start + " " + end);
    }
}