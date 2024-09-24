import java.io.*;
import java.util.*;

public class Main { // CODE_TREE

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st1.nextToken());
        String s1 = st1.nextToken();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st2.nextToken());
        String s2 = st2.nextToken();

        if ((a1 >= 19 && s1.equals("M")) || (a2 >= 19 && s2.equals("M")))
            bw.write ("1");
        else
            bw.write ("0");
        bw.flush();
    }
}