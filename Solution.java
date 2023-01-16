import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


/*This method uses the time advantage of BufferedReader and StringTokenizer and the advantage of user-defined methods for less typing and therefore a faster input altogether. These get accepted with a time of 1.23 s and this method is very much recommended as it is easy to remember and is fast enough to meet the needs of most of the question in competitive coding. */

public class Solution{
    // create class to read fast input 
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str="";
            try{
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }

// main method
public static void main(String[] args){
    FastReader s = new FastReader();
    int n = s.nextInt();
    int k = s.nextInt();
    int count =0;
    while(n-- > 0){
        int x = s.nextInt();
        if(x%k == 0){
            count++;
        }
    }
    System.out.println(count);
}
}

