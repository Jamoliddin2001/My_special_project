import java.io.InputStream;
import java.util.Scanner;

public class Ali {

    public static void main(String[] args) {

        int N;
        Scanner scan=new Scanner(System.in);
        N=scan.nextInt();

        int[] mass = new int[N];
        for(int i = 0 ; i<N;i++){
            mass[i] = scan.nextInt();
        }
        for(int i = N-1 ; i>=0;i--){
            System.out.print(mass[i]+"     ");
        }

    }
}

