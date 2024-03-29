//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表


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
class Solution21 {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val preHead = ListNode(0)
        var preNode = preHead
        var left = l1
        var right = l2
        while (left != null || right != null) {
            when {
                left == null -> {
                    preNode.next = right
                    right = null
                }
                right == null -> {
                    preNode.next = left
                    left = null
                }
                left.`val` > right.`val` -> {
                    preNode.next = right
                    right = right.next
                }
                else -> {
                    preNode.next = left
                    left = left.next
                }
            }
            preNode = preNode.next!!
        }

        return preHead.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

//leetcode submit region end(Prohibit modification and deletion)
