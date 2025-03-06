package medium

class `11-ContainerWithMostWater` {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var area = 0

        while( left < right){
            val newArea = (right-left ) * Math.min(height[left], height[right])
            area = Math.max(area, newArea)

            if ( height[left] < height[right] )
                left++
            else
                right--
        }
        return area;
    }
}