//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学


//leetcode submit region begin(Prohibit modification and deletion)
class Solution7 {
    fun reverse(x: Int): Int {
        var source = x
        var result = 0L
        while (source != 0) {
            result *= 10
            if (result > Int.MAX_VALUE || result < Int.MIN_VALUE) {
                return 0
            }
            result += (source % 10)
            source /= 10
        }
        return result.toInt()
    }
}
//leetcode submit region end(Prohibit modification and deletion)
