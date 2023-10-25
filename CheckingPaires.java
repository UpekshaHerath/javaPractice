import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CheckingPaires {
    public static void main(String[] args) {
         int[] socks = {1, 2, 3, 2, 1, 3, 1, 2, 3, 1}; // Example input

        int pairsCount = countSockPairs(socks);
        System.out.println("Number of pairs: " + pairsCount);
    }

    public static int countSockPairs(int[] socks) {
        Map<Integer, Integer> sockCounts = new HashMap<>();
        int pairsCount = 0;

        // Count the number of each type of sock
        for (int sock : socks) {
            if (sockCounts.containsKey(sock)) {
                int count = sockCounts.get(sock);
                sockCounts.put(sock, count + 1);
            } else {
                sockCounts.put(sock, 1);
            }
        }

        // Count the number of pairs
        for (int count : sockCounts.values()) {
            pairsCount += count / 2;
        }

        return pairsCount;
    }
}
