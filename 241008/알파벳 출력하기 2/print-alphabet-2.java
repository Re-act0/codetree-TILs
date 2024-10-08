import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int N = Integer.parseInt(br.readLine());
        char s = 65;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (s == '['){
                    s -= 26;
                }
                if (i > j) {
                    bw.write("  ");
                } else {
                    bw.write(s + " ");
                    s++;
                }
            }
            bw.write("\n");
        }


        bw.flush();
    }
}