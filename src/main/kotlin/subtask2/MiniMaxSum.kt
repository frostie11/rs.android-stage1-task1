package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var resultArray = mutableListOf<Int>()
        var totalSum = 0;
        var max = 0
        var min = Int.MAX_VALUE
        var output: IntArray = IntArray(input.size)
        for (i in 0..input.size - 1) {
            totalSum += input[i]
        }
        for (i in 0..input.size - 1) {
            output[i] = totalSum - input[i]
            max = if (output[i] > max) output[i] else max
            min = if (output[i] < min) output[i] else min
        }
        resultArray.add(min)
        resultArray.add(max)
        return resultArray.toIntArray()
    }

}

