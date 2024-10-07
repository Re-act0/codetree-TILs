import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int num = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(num + "");
                num--;
                if (num < 1)
                    num = 9;
            }
            bw.write("\n");
        }

        bw.flush();
    }
}