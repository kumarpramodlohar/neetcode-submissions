class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mapped = new HashMap<>();
        List<List<Integer>> freq = new ArrayList<>();
        for(int num : nums) {
            mapped.put(num, mapped.getOrDefault(num, 0)+1);
        }

        int maxFreq = 0;
        for(int value : mapped.values()) {
            maxFreq = Math.max(value, maxFreq);
        }

        for(int i=0; i<=maxFreq; i++) {
            freq.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry : mapped.entrySet()){
            int number = entry.getKey();
            int frequency = entry.getValue();
            freq.get(frequency).add(number);

        }

        int[] res = new int[k];
        int index = 0;
        for(int i= maxFreq; i>0 && index < k; i--) {
            for(int n : freq.get(i)) {
                res[index++] = n;
                if(index == k) {
                    return res;
                }
            }
        }

        return res;
        
    }
}
