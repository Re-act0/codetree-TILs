import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (cnt < 2) {
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    bw.write("*");
                    if (j == n - 1) {
                        bw.write("\n");
                    }
                }
            bw.write("\n");
            cnt++;
        }
        bw.flush();
    }
}