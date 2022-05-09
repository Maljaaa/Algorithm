import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] arr = new int[n];
        boolean check = false;
        int count = 0;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
            check = false;
            for(int j = 2; j < arr[i]; j++){
                if(arr[i] == 1 || arr[i] % j == 0){
                    check = true;
                    break;
                }
                if(j == arr[i] - 1 && check == false){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
