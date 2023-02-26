import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []arr = str.split(" ");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}