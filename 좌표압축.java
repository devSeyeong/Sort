import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.IOException;
import java.lang.Math;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args)  throws IOException{



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());

        Set<Integer> set = new HashSet<>();
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i=0 ; i<n ;i++){
            int num = Integer.parseInt(st2.nextToken());
            set.add(num);
            arr[i] = num;
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }

        for(int num : arr){
            bw.write(map.get(num) + " ");
        }
        bw.flush();
        bw.close();
        return;
    }


}
