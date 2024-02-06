
//Collections DSAs

fun main(args: Array<String>) {

    print("IMMUTABLE ARRAYLIST WITHOUT DATATYPES\n")
//Immutable ary without datatype
    var iAlist = arrayListOf(2,false,"Hello",2.5)
    iAlist[0] = 10
    iAlist[3] = true
    iAlist[2] = "Kotlin"
    print(iAlist)

    //mutable ary
    var ary1 = mutableListOf(34,true,"jigar",5.65)
    ary1[3] = false
    ary1[1] = "Hello"
    ary1.add("Added me!")
    ary1.add(true)

    print("\n"+ary1+"    Array size ${ary1.size}")

    print("\nMUTABLE ARRAYLIST WITHOUT DATATYPES\n")

    //Arylist with data types
    var intAry = mutableListOf<Int>()
    intAry.add(1)
    intAry.add(12)
    intAry.add(78)
    intAry.add(94)

    print("\n Integer Mutable List : $intAry")

    var stringary = mutableListOf<String>("one","two","three","four")
    stringary.add("five")
    stringary.add("six")

    print("\n String Mutable List : $stringary")

    for (s in stringary){
        print("\n$s")
    }


    //SETS "MUTABLE AND IMMUTABLE" - UNIQ ELEMENTS


    var mSet = mutableSetOf("I","am","not","uniq","not")
    for (s in mSet){
        print("\n $s")
    }

    mSet.forEach{
        print("\n $it")
    }

    var  iSet = setOf<Int>(1,1,1,2,44,23,424,3)
    for(i in iSet){
        print("\n $i")
    }


    iSet.forEach{
        print("\n $it")
    }

    print("\nImmutable Map\n")
    //immutable map
    var mMap = mapOf("1" to "One","2" to "two","3" to "Three")
    mMap.forEach{(key,value)-> print("\n $key -> $value") }

    print("\nMutable Map\n")
//mutable mao
    var iMap = mutableMapOf("1" to "one","2" to "two","3" to " three")
    iMap.put("4","four")

    iMap.forEach { k, y -> print("\n$k -> $y")  }
}