class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        int closeSum=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                 sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closeSum))
                closeSum=sum;
               else  if(sum<target) j++;
                else
                k--;
            }
        }
        return closeSum;
    }
}