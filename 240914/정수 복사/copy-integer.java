import java.io.*;
import java.util.*;

public class Main { // 3226번 전화요금

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int a = 3;
        int b = 4;
        b = a;
        int sum = a * b;


        bw.write(a + " " + b + "\n" );
        bw.write("" + sum );

        bw.flush();
    }
}