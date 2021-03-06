package billcypher.easy;

import structures.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedlistCycle_141 {

    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> a = new HashMap<>();
        while(head != null) {
            if (a.get(head) != null) return true;
            else a.put(head, 1);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleSet(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while(head != null) {
            if (nodesSeen.contains(head)) return true;
            else nodesSeen.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleTwoPointers(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
