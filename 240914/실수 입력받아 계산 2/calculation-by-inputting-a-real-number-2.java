import java.io.*;
import java.util.*;

public class Main { // 3226번 전화요금

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        double a = Double.parseDouble(br.readLine());
        double result = a + 1.5;


        bw.write("" + String.format("%.2f", result));

        bw.flush();
    }
}