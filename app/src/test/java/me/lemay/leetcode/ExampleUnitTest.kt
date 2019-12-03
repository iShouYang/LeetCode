package me.lemay.leetcode

import ListNode
import Solution
import Solution2
import Solution234
import Solution3
import Solution4
import Solution53
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun test2() {
        val node = ListNode(6)
        node.next = ListNode(5)
        node.next!!.next = ListNode(4)
        node.next!!.next!!.next = ListNode(3)
        node.next!!.next!!.next!!.next = ListNode(2)
        node.next!!.next!!.next!!.next!!.next = ListNode(1)
        node.next!!.next!!.next!!.next!!.next!!.next = ListNode(0)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(0)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(2)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(3)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next =
            ListNode(4)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next =
            ListNode(5)
        node.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next =
            ListNode(6)
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

        val node3 = ListNode(6)
        node3.next = ListNode(5)
        node3.next!!.next = ListNode(6)
        Solution234().isPalindrome(node3)
    }

    @Test
    fun test3() {
        println(Solution3().lengthOfLongestSubstring("abcabcdbb"))
    }

    @Test
    fun test4() {
        Solution4().findMedianSortedArrays(intArrayOf(4, 5, 6), intArrayOf(1, 2, 3))
    }

    @Test
    fun test53() {
        println(Solution53().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

    @Test
    fun test70() {
        println(Solution().climbStairs(1))
    }
}
