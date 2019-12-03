//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
class Solution70 {
    fun climbStairs(n: Int): Int {
        if (n == 0) return 1
        var result = 0.0
        // 跨两步的最大次数
        val max2Step = n / 2
        for (i in 0..max2Step) {
            // 总共跨出的步数
            var totalStep = i + (n - 2 * i) * 1.0
            var ans = 1.0
            // 计算 C(totalStep, i)
            for (j in 1..i) {
                ans *= totalStep / j
                totalStep--
            }
            result += ans
        }
        return (result + 0.5).toInt()
    }
}
//leetcode submit region end(Prohibit modification and deletion)
