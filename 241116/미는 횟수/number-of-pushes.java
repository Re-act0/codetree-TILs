import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        // A == 65, Z == 90
        // a == 97, z == 122 // 32 를 빼고 더하면 된다.
        // 0 == 48, 9 == 57

        String s1 = br.readLine();
        String s2 = br.readLine();
        int num = s1.length();
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            s1 = s1.substring(num - 1, num) + s1.substring(0, num - 1);
            if (s1.equals(s2)) {
                bw.write(i + "");
                bw.flush();
                return;
            }
        }

        bw.write("-1");

        bw.flush();
    }
}
