class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num,map.get(num)+1);
            }
        } 

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b) -> map.get(b) - map.get(a));

        int [] results = new int [k];
        for (int i = 0; i < k; i++) {
            results[i] = keys.get(i);
        }

        return results;
    }
}
