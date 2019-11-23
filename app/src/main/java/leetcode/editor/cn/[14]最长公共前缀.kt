//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        var result = ""
        for (i in 0..strs[0].length) {
            val prefix = strs[0].substring(0, i)
            strs.forEach {
                if (it.length < i || prefix != it.substring(0, i)) {
                    return prefix.substring(0, prefix.length - 1)
                } else {
                    result = prefix
                }
            }
        }
        return result
    }
}
//leetcode submit region end(Prohibit modification and deletion)
