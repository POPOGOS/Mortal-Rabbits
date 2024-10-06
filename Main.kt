fun ShowArray(ArrayInt: IntArray):String{
    var StringArray:String = ""
    for(element in ArrayInt){
        StringArray += element.toString()
    }
    return StringArray
}

fun SumArray(ArrayInt:IntArray):Int{
    var Sum:Int = 0
    for(element in ArrayInt){
        Sum += element
    }
    return Sum
}

fun MortalRabbits(n:Int,m:Int):Int {
    var ArrayRabbits = IntArray(m)
    var NewRabbits:Int = 0
    ArrayRabbits[0] = 1
    for(i in 0 until n-1){
        NewRabbits = SumArray(ArrayRabbits.copyOfRange(1,m))
        ArrayRabbits = ArrayRabbits.reversedArray()
        for(j in 0 until m-1){
            ArrayRabbits[j] = ArrayRabbits[j+1]

        }
        ArrayRabbits = ArrayRabbits.reversedArray()
        ArrayRabbits[0] = NewRabbits

        println(ShowArray(ArrayRabbits))

    }
    return SumArray(ArrayRabbits)
}

fun main() {

    print(MortalRabbits(6,3))
}