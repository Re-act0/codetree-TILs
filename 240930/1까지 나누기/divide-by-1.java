import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int x = 1; x <= n; x++) {
            n /= x;
            cnt++;
            if (n <= 1)
                break;
        }
        cnt++;
        bw.write(cnt + "");


        bw.flush();
    }
}