import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        if (a % 2 == 1) {
            a += 3;
            if (a % 3 == 0)
                a /= 3;
        }

        if (a % 3 == 0)
            a /= 3;

        bw.write(a + "");

        bw.flush();
    }
}