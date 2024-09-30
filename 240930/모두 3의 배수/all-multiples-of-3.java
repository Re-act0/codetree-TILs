import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int res = 1;
        int cnt = 5;
        while (cnt > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x % 3 != 0)
                res = 0;
            cnt--;
        }
        bw.write(res + "");
        bw.flush();
    }
}