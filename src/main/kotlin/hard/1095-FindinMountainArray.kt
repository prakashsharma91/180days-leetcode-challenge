package hard

class Solution1095 {
    fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {
        var peek = findPeakIn(mountainArr)

        println(peek)

        var left = 0;
        var right = peek;
        while( left <= right ){
            var mid = left + (right-left)/2
            val value = mountainArr.get(mid)
            if ( value == target )
                return mid;
            else if ( value > target ){
                right = mid-1;
            } else {
                left = mid +1;
            }

        }

        left = peek;
        right = mountainArr.length()-1;
        while( left <= right ){
            var mid = left + (right-left)/2
            val value = mountainArr.get(mid)
            if ( value == target )
                return mid;
            else if ( value < target ){
                right = mid-1;
            } else {
                left = mid +1;
            }
        }
        return -1;
    }

    fun findPeakIn(mountainArr: MountainArray): Int{
        var start = 0
        var end = mountainArr.length() - 1
        while(start<end){
            val mid = start + (end - start) / 2
            if( mountainArr.get(mid) <= mountainArr.get(mid + 1)) {
                start = mid + 1
            }else end = mid
        }
        return start
    }
}

class MountainArray {
        fun get(index: Int): Int {
            TODO()
        }
         fun length(): Int {
             TODO()
         }
}