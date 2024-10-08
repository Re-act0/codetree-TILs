import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int num = 2;
        for (int i = 0; i < 4; i++) {
            for (int j = b; j >= a; j--) {
                bw.write(j + " * " + num + " = " + j * num);
                if (j != a) {
                    bw.write(" / ");
                }
            }
            if (num < 8)
                num += 2;
            bw.write("\n");
        }

        bw.flush();
    }
}