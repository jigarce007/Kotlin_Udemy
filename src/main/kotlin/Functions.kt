
    var ml = mutableListOf<String>("this","is","functios","exercise")
    var mm = mutableMapOf<Int,String>(1 to "one",2 to "two",3 to "three",4 to "four")
    var numList = mutableListOf(2,4.5,2,99,90.45,6,54,98.50)

    fun main(args: Array<String>) {
        mm.put(6,"Six")
        printmapvalues(mm)
    }

    fun printmapvalues(m:MutableMap<Int,String>){
        m.forEach{(k,v)->print("\n $v")}
    }

    fun addIt(mlist : MutableList<Unit>){
        var sum =0
        for (m in mlist){
            sum = 10

        }
    }

