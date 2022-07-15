import java.util.Scanner;

public class GrassField {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int count = 0;
            if(a == 1){
                count++;
            }
            if(b == 1) count++;
            if(c == 1) count++;
            if(d == 1) count++;

            if(count == 0) System.out.println(0);
            if(count == 1 || count == 2 || count == 3) System.out.println(1);
            if( count == 4) System.out.println(2);
        }
    }
}