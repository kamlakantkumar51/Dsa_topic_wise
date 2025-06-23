import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static List<String> findSubsequences(String s) {
        int n = s.length();
        List<String> subsequences = new ArrayList<>();
        
        for (int i = 0; i < (1 << n); i++) {  // 1 << n = 2ⁿ
            StringBuilder sub = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {  // Check if j-th bit is set
                    sub.append(s.charAt(j));
                }
            }
            subsequences.add(sub.toString());
        }
        return subsequences;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> result = findSubsequences(s);
        System.out.println(result);
    }
}
