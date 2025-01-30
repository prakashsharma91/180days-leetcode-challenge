package easy

class `88-MergeSortedArray` {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var k = m + n - 1;
        var i = m - 1;
        var j = n - 1;
        while(i >= 0 || j >=0 ){
            if ( getValue(nums1, i) > getValue(nums2, j)) {
                nums1[k--] = nums1[i--]
            } else {
                nums1[k--] = nums2[j--]
            }
        }
    }

    fun getValue(nums: IntArray, idx: Int): Int{
        if ( idx < 0 )
            return Integer.MIN_VALUE
        else
            return nums[idx];
    }
}