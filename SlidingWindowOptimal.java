import java.util.*;

public class SlidingWindowOptimal{
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int k = 3;
        int n = arr.length;

        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>(); 

        for (int i = 0; i < n; i++) {

        
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {  // 1. Remove out-of-window indexes
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {      // 2. Remove smaller elements (not useful for max)
                dq.pollLast();
            }

            dq.offerLast(i);         // 3. Add current element index

            if (i >= k - 1) {       // 4. If window has hit size k, record the max (at front of deque)
                result.add(arr[dq.peekFirst()]);
            }
        }

        System.out.println("Sliding window max elements: " + result);
    }
}
