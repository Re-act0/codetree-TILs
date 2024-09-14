import java.io.*;
import java.util.*;

public class Main { // 3226번 전화요금

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = a + b + c;

        a = sum;
        b = sum;
        c = sum;

        bw.write(a + " " + b + " " + c );

        bw.flush();
    }
}