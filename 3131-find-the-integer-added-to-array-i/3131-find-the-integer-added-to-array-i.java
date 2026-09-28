class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n = nums1.length;
        
        int num = 0;

        for(int i=0; i<n; i++) {
            num += (nums2[i] - nums1[i]);
        }

        return num / n;
    }
}