import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.lang.Math;


public class Main {
    public static class Point implements Comparable<Point> {
        public int x;
        public int y;
        public Point(int a, int b){
            this.x = a;
            this.y = b;
        }

        @Override
        public int compareTo(Point p){
            if(this.y == p.y) {
                return this.x - p.x;
            } else {
                return this.y - p.y;
            }
        }
    }

    public static void main(String[] args)  throws IOException{



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());

        Point[] arr = new Point[n];

        for(int i=0 ; i<n ;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            arr[i] = new Point(x,y);
        }

        Arrays.sort(arr);

        for(Point p : arr){
            bw.write(p.x+" "+p.y+"\n");
        }
        bw.flush();
        bw.close();
        return;
    }


}
