fun main() {

    val nums = arrayOf(10, 33, 13, 72, 44, 51, 17)

    val nums2 = nums.map {
        i -> i + nums[2] + nums[3] - nums[4]
    }

    nums2.forEach{ print(" $it ")}
}