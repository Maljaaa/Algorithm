import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BigNum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        String a = stringTokenizer.nextToken();
        String b = stringTokenizer.nextToken();

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        System.out.println(A.add(B));
    }
}
