import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = 0;

        if (a >= b && a >= c)
            if (b >= c) {
                max = b;
            } else if (b <= c) {
                max = c;
            }

        if (b >= a && b >= c)
            if (a >= c) {
                max = a;
            } else if (a <= c) {
                max = c;
            }

        if (c >= a && c >= b)
            if (a >= b) {
                max = a;
            } else if (a <= b) {
                max = b;
            }


        bw.write(max + "");
        bw.flush();
    }
}