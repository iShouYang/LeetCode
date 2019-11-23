//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学


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
class Solution2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var l1 = l1
        var l2 = l2
        var decimal = 0
        val result = ListNode(0)
        var temp = result

        while (l1 != null) {
            var nodeValue: Int
            if (l2 == null && decimal > 0) {
                nodeValue = l1.`val` + decimal
                l1.next = l1
            } else if (l2 == null) {
                temp.next = l1
                break
            } else {
                nodeValue = l1.`val` + l2.`val` + decimal
                l1 = l1.next
                l2 = l2.next
            }
            if (nodeValue > 9) {
                decimal = 1
                nodeValue -= 10
            } else {
                decimal = 0
            }
            temp.next = ListNode(nodeValue)
            temp = temp.next!!
        }

        while (l2 != null) {
            var nodeValue: Int
            if (l1 == null && decimal > 0) {
                nodeValue = l2.`val` + decimal
                l2.next = l2
            } else if (l1 == null) {
                temp.next = l2
                break
            } else {
                nodeValue = l1.`val` + l2.`val` + decimal
                l1 = l1.next
                l2 = l2.next
            }
            if (nodeValue > 9) {
                decimal = 1
                nodeValue -= 10
            } else {
                decimal = 0
            }
            temp.next = ListNode(nodeValue)
            temp = temp.next!!
        }

        if (decimal > 0) {
            temp.next = ListNode(decimal)
        }
        return result.next
    }

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
//leetcode submit region end(Prohibit modification and deletion)
