import java.io.*;
import java.util.StringTokenizer;

public class UpSnail {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int up = Integer.parseInt(stringTokenizer.nextToken());
        int down = Integer.parseInt(stringTokenizer.nextToken());
        int length = Integer.parseInt(stringTokenizer.nextToken());

        int day = (length - down) / (up - down);
        if((length - down) % (up - down) != 0){
            day++;
        }
        System.out.println(day);
    }
}
