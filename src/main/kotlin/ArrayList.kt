class ArrayList(
private var input: IntArray
) {

    fun size(): Int {
        return input.size
    }

    fun isEmpty(): Boolean {
        return input.isEmpty()
    }


    fun toArray(): IntArray {
        return input
    }

    fun get(num: Int): Int {

        if (num < input.size)
            return input[num]
        else{
            return -1
        }
    }

    fun add(num: Int) {
        input += num
    }

    fun set(choose: Int, replace: Int){
        input[choose] = replace
    }

    fun contains(num: Int): Boolean {
        for (i in input.indices){
            if(input[i] == num )
                return true
        }
        return false
    }
}