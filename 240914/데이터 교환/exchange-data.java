import java.io.*;
import java.util.*;

public class Main { // 3226번 전화요금

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int a = 5;
        int b = 6;
        int c = 7;
        int s1 = 0, s2 = 0;

        s1 = b;
        b = a;
        s2 = c;
        c = s1;
        a = s2;

        bw.write(a + "\n" );
        bw.write(b + "\n" );
        bw.write(c + "" );

        bw.flush();
    }
}