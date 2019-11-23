//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
// 输入: "()"
//输出: true
//
//
// 示例 2:
//
// 输入: "()[]{}"
//输出: true
//
//
// 示例 3:
//
// 输入: "(]"
//输出: false
//
//
// 示例 4:
//
// 输入: "([)]"
//输出: false
//
//
// 示例 5:
//
// 输入: "{[]}"
//输出: true
// Related Topics 栈 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution20 {
    fun isValid(s: String): Boolean {
        if (s == "") return true
        val deque = java.util.ArrayDeque<Int>()
        s.forEach {
            val code = when (it) {
                '(' -> 1
                ')' -> -1
                '[' -> 2
                ']' -> -2
                '{' -> 3
                '}' -> -3
                else -> throw Exception()
            }
            if (code > 0) {
                deque.push(code)
            } else {
                if (deque.size <= 0 || deque.pop() + code != 0) {
                    return false
                }
            }
        }
        return deque.size == 0
    }
}
//leetcode submit region end(Prohibit modification and deletion)
