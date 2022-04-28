import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findFraction {
    public static void main(String[] args) throws IOException {
        // read parameter
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        // cross_count -> now cross count, prev_count_sum -> to count previous number
        int cross_count = 1, prev_count_sum = 0;

        while(true){
            // if n <= max count
            if(n <= prev_count_sum + cross_count){
                // min = 1, max = cross_count
                // if odd number -> left to right
                if(cross_count % 2 == 1){
                    // denominator -> min to max, numerator -> max to min
                    System.out.println((cross_count - (n - prev_count_sum - 1)) + "/" + (n - prev_count_sum));
                    break;
                }
                // if even number -> right to left
                else{
                    // denominator -> max to min, numerator -> min to max
                    System.out.println((n - prev_count_sum) + "/" + (cross_count - (n - prev_count_sum - 1)));
                    break;
                }
            }else{
                // next cross
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}
