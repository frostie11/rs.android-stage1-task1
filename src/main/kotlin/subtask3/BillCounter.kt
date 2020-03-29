package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var b_charged = 0
        var b_actual = 0
        for (i in 0..bill.size-1)
        {
            if (i!=k)
                b_actual += bill[i]
        }
        var diff = b - b_actual/2
        return if (diff == 0) "Bon Appetit" else diff.toString()
    }
}
