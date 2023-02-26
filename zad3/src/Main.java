import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0, max=0;
        for(int i = 0; i<text.length()-1; i++){
            if(text.charAt(i)=='('){
                if(text.charAt(i+1)==')'){
                    count+=2;
                    if(count>max){
                        max=count;
                    }
                }
                else{
                    count=0;
                }
            }
        }
        System.out.println(max);
    }
}