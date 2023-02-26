import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List <Integer> ages = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ages.add(scanner.nextInt());
        }
//        System.out.println(ages);
        List<Integer> team1 = new ArrayList<>();
        List<Integer> team2 = new ArrayList<>();

        List<Integer> ostatuk = new ArrayList<>();
        while(ages.size()>0){
            int min = Collections.min(ages);
            int max = Collections.max(ages);
            if(!team1.contains(min))
                team1.add(min);
            else
                ostatuk.add(min);
            if(!team2.contains(max))
                team2.add(max);
            else
                ostatuk.add(max);
            ages.remove(Integer.valueOf(min));
            ages.remove(Integer.valueOf(max));
        }
        for(int num : ostatuk){
            if(num>team1.get(team1.size()-1)){
                team1.add(num);
                continue;
            }
            if(num<team2.get(team2.size()-1)){
                team2.add(num);
            }
        }
        System.out.println(team1);
        System.out.println(team2);
        int size = Math.min(team1.size(), team2.size());
        System.out.println(n-(size*2));
    }
}
