import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMHotel {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        StringBuilder sb = new StringBuilder(); // build string

        for(int i = 0; i < t; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int h = Integer.parseInt(stringTokenizer.nextToken());
            stringTokenizer.nextToken(); // no input ( w )
            int n = Integer.parseInt(stringTokenizer.nextToken());

            if(n % h == 0){
                sb.append((h * 100) + (n / h)).append('\n');
            }else{
                sb.append(((n % h) * 100) + ((n / h) + 1)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
