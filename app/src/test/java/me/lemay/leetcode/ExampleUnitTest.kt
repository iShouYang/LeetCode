package me.lemay.leetcode

import ListNode
import Solution
import Solution2
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun test2() {
        val node = ListNode(9)
        node.next = ListNode(9)
        node.next!!.next = ListNode(9)
        node.next!!.next!!.next = ListNode(9)
        node.next!!.next!!.next!!.next = ListNode(9)
        node.next!!.next!!.next!!.next!!.next = ListNode(9)
        node.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next =
            ListNode(9)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next =
            ListNode(9)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next =
            ListNode(9)
        val node1 = ListNode(2)
        node1.next = ListNode(9)
        node1.next!!.next = ListNode(9)
        node1.next!!.next!!.next = ListNode(9)
        node1.next!!.next!!.next!!.next = ListNode(9)
        node1.next!!.next!!.next!!.next!!.next = ListNode(9)
        node1.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node1.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node1.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node1.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node1.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)
        node1.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next =
            ListNode(9)
        node1.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next =
            ListNode(9)
        node1.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next =
            ListNode(9)
        println(Solution2().addTwoNumbers(node, node1))
    }

    @Test
    fun test3() {
        println(Solution().lengthOfLongestSubstring("abcabcbb"))
    }
}
