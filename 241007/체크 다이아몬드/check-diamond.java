import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int j = 0; j < n - i - 1; j++) {
                    bw.write(" ");
                }
                for (int k = 0; k < i + 1; k++) {
                    bw.write("* ");
                }
            } else if (i >= n) {
                for (int j = 0; j < i - n + 1; j++) {
                    bw.write(" ");
                }
                for (int k = i - n; k < n - 1; k++) {
                    bw.write("* ");
                }
            }

            bw.write("\n");
        }

        bw.flush();
    }
}