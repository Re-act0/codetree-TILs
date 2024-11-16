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
        
        int res = Integer.parseInt(s1.replaceAll("[^0-9]", "")) + Integer.parseInt(s2.replaceAll("[^0-9]", ""));
        bw.write(res + "");

        bw.flush();
    }
}

