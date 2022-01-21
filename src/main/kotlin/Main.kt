fun main() {
    val arrayList = ArrayList(intArrayOf(10, 40, 30, 60))
    println(arrayList.isEmpty())

    println(arrayList.size())

    println(arrayList.toArray())

    println(arrayList.get(5))

    arrayList.add(15)

    arrayList.set(2,80)

    println(arrayList.toArray().toString())

    println(arrayList.contains(40))

}