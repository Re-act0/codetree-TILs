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

        int cnt = 1;

        while (num > 0) {
            s1 = s1.substring(1, s1.length()) + s1.substring(0, 1);
            if (s1.equals(s2)) {
                bw.write(cnt + "");
                break;
            } else {
                cnt++;
            }
            num--;
        }
        if (cnt - 1 == s1.length()) {
            bw.write("-1");
        }
        bw.flush();
    }
}

