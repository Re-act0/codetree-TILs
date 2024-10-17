import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        // A == 65, Z == 90
        // a == 97, z == 122 // 32 를 빼고 더하면 된다.
        // 0 == 48, 9 == 57

        char c = 51;
        bw.write(c);


        bw.flush();
    }
}