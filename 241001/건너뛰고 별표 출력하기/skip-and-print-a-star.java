import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                bw.write("*");
            }

            if (i != 0) {
                bw.write("\n");
                bw.write("\n");
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                bw.write("*");
            }
            if (i != n - 1) {
                bw.write("\n");
                bw.write("\n");
            }
        }
        bw.flush();
    }
}