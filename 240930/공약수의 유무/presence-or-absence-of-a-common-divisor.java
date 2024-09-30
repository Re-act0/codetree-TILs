import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int res = 0;

        for (int i = a; i <= b; i++) {

            if (1920 % i == 0 && 2880 % i == 0) {
                res = 1;
                break;
            }
        }
        bw.write(res +"");

        bw.flush();
    }
}