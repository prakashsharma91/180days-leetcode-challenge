package easy

class `706-DesignHashMap` {
    private val arrayMap = IntArray(10_000_001) { -1 }

    fun put(key: Int, value: Int) {
        arrayMap[key] = value
    }

    fun get(key: Int): Int {
        return arrayMap[key]
    }

    fun remove(key: Int) {
        arrayMap[key] = -1
    }
}