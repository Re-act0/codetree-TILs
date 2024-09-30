import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int div = 1;

        while (n > 1) {
            n /= div;
            cnt++;
            div++;
        }
        bw.write(cnt + "");


        bw.flush();
    }
}