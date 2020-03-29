package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val halfN = n / 2
        var leftSide = digitString.take(halfN)
        var rightSide = digitString.takeLast(halfN)
        var errorDigitCount: Int = 0
        for(i in 0 until halfN)
        {
            if (leftSide[i] != rightSide[halfN - i - 1])
            {
                errorDigitCount += 1
            }
        }
        if (errorDigitCount > k)
        {
            return "-1"
        }
        if((k - errorDigitCount) > 0)
            for(i in 0 until (k-errorDigitCount)) {
                leftSide = leftSide.replaceRange(i, i+1, "9")
            }
        val palindromOne = digitString.replaceRange(0,halfN,rightSide.reversed()).replaceRange(digitString.length-halfN,digitString.length,rightSide)
        val palindromTwo = digitString.replaceRange(digitString.length-halfN,digitString.length,leftSide.reversed()).replaceRange(0,halfN,leftSide)
        if(palindromOne.toInt() > palindromTwo.toInt())
        {
            return palindromOne
        }else
            return palindromTwo
    }
}
