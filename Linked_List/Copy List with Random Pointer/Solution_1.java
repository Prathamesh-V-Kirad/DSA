/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }

        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        Node original = head;
        Node copy = head.next;
        Node copyHead = copy;

        while (original != null) {
            original.next = original.next.next;
            if (copy.next != null) {
                copy.next = copy.next.next;
            }
            original = original.next;
            copy = copy.next;
        }

        return copyHead;
    }
}