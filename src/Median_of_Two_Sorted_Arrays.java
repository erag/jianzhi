public class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if ((l1 + l2)%2 == 0) {
            return gettopk(nums1, nums2, (l1 + l2)/2+1);
        }else {
            return (gettopk(nums1, nums2, (l1 + l2)/2) + gettopk(nums1, nums2, (l1 + l2)/2))*0.5;
        }
    }
    public int gettopk(int[] nums1, int[] nums2, int k) {
        int length1 = nums1.length, length2 = nums2.length;
        int index1 = 0, index2 = 0;
        while(true) {
            if (index1 == length1) {
                return nums2[index2+k-1];
            }
            if (index2 == length2) {
                return nums1[index1+k-1];
            }
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }
            int newindex1 = Math.min(index1 + k/2, length1)-1;
            int newindex2 = Math.min(index2 + k/2, length2)-1;
            if (nums1[newindex1] > nums2[newindex2]) {
                k -= (newindex2 - index2 + 1);
                index2 = newindex2+1;
            }else {
                k -= (newindex1 - index1 + 1);
                index1 = newindex1+1;
            }
        }

    }

}
