class Solution {
    public int lastStoneWeight(int[] stones) {

PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to the heap
        for (int stone : stones) {
            pq.offer(stone);
        }

        // Smash the two heaviest stones
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            if (first != second) {
                pq.offer(first - second);
            }
        }

        // Return remaining stone or 0
        return pq.isEmpty() ? 0 : pq.poll();
    }
}

        
        
    
