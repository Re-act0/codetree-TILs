import java.io.*;
import java.util.*;

public class Main { // 3226번 전화요금

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        double a = 5.26;
        double b = 8.27;
        double result = (a * b);


        bw.write(String.format("%.3f", result));

        bw.flush();
    }
}