fun main (){
    val nums = arrayOf(1,2,3,4,5,6)

    for (i in nums){
        val result = mutableListOf<Int>()
        result[i] = nums[i] * nums[5] -1 - i
        println(i)
    }


}

// result = []
//for i in array
//  result[i] = array[i] * array[len(array) - 1 - i]