import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BecomePresident {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine()); // testcase

        StringBuilder stringBuilder = new StringBuilder(); // build string

        for(int i = 0; i < t; i++){
            int k = Integer.parseInt(bufferedReader.readLine()); // floor
            int n = Integer.parseInt(bufferedReader.readLine()); // number
            int[][] apt = new int[k+1][n+1]; // apt arrangement

            // floor 0
            for(int p = 0; p < n + 1; p++){
                apt[0][p] = p + 1;
            }

            for(int j = 1; j < k + 1; j++){
                for(int l = 0; l < n + 1; l++){
                    if(l == 0){
                        apt[j][l] = 1;
                    }else{
                        apt[j][l] = apt[j][l-1] + apt[j - 1][l];
                    }
                }
            }
            stringBuilder.append(apt[k][n-1]).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
