import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        // A == 65, Z == 90
        // a == 97, z == 122 // 32 를 빼고 더하면 된다.
        // 0 == 48, 9 == 57

        int i = Integer.parseInt(br.readLine());
        int res = 0;
        while (i > 0) {
            int s = Integer.parseInt(br.readLine());
            res += s;
            i--;
        }

        String s = String.valueOf(res);
        String result = s.substring(1, s.length()) + s.substring(0, 1);

        bw.write(result + "");
        bw.flush();
    }
}

