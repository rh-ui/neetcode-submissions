class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        // System.out.print(freq);

        // Get top K entries sorted by value descending
        List<Map.Entry<Integer, Integer>> topKEntries = freq.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .collect(Collectors.toList());

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = topKEntries.get(i).getKey();
        }

       
        return res;
    }
}
