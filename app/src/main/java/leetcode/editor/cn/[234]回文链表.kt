//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution234 {
    fun isPalindrome(head: ListNode?): Boolean {
        if (head?.next == null) return true

        var fast = head
        var slow = head
        var pre: ListNode? = null
        var prepre: ListNode? = null
        while (fast?.next != null) {
            pre = slow

            fast = fast.next!!.next
            slow = slow!!.next

            pre!!.next = prepre
            prepre = pre
        }
        if (fast != null) {
            slow = slow!!.next
        }
        while (pre != null && slow != null) {
            if (pre.`val` != slow.`val`) {
                return false
            }
            pre = pre.next
            slow = slow.next
        }
        return true
    }
}
//leetcode submit region end(Prohibit modification and deletion)
