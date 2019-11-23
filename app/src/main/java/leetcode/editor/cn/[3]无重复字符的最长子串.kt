//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0

        var map: HashMap<Char, Char> = HashMap(s.length)
        var temp = map

        val list = s.map { it }

        for (i in 0 until list.size) {
            for (j in i until list.size) {
                if (!temp.containsKey(list[j])) {
                    temp[list[j]] = list[j]
                } else {
                    break
                }
                if (temp.size > map.size) {
                    map = temp
                }
            }
            if (list.size - map.size < 2) {
                return map.size
            }
            temp = HashMap(s.length)
        }
        return map.size
    }
}
//leetcode submit region end(Prohibit modification and deletion)
