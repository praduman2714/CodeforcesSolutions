import java.util.ArrayList;
import java.util.Scanner;

public class permutationCodeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(2);
            //int k = 0;
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = 1; i<= n; i=i+2){
                int c = i;
                boolean flag = true;
                while(flag){
                    if(c > n){
                        flag = false;
                        //break;
                    }else{
                        al.add(c);
                        c= c*2;
                    }
                }
            }

            for(int i = 0; i<al.size(); i++){
                System.out.print(al.get(i) + " ");
            }
            System.out.println();
        }
    }
}