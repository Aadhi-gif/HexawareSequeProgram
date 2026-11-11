

import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

class queue {

    public static void main(String[] args) {

        int a[] = {3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 7, 8};

        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i < a.length; i++) {
            q.offer(a[i]);
        }

        int first = q.poll();

        q.offer(first);

        for (int i = 0; i < a.length; i++) {
            a[i] = q.poll();
            q.offer(a[i]);
        }

        System.out.println(Arrays.toString(a));
    }
}
