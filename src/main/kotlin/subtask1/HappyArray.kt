package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2)
            return  sadArray
        var happyArray = mutableListOf<Int>()
        var countChange = 0;
        happyArray.add(sadArray[0])
        for (i in 1..sadArray.size-2) {
            if (sadArray[i] < sadArray[i-1] + sadArray[i+1])
            {
                happyArray.add(sadArray[i])
            }
            else  countChange++
        }
        happyArray.add(sadArray[sadArray.size-1])
        return  if (countChange == 0) happyArray.toIntArray() else convertToHappy(happyArray.toIntArray())
    }

}
