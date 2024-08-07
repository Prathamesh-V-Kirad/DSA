/*Node class  used in the program
class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }
}
*/
/*  Function which returns the  root of
    the flattened linked list. */
class GfG {
    Node flatten(Node root) {
       if (root == null || root.next == null) {
            return root;
        }
        root.next = flatten(root.next);
        root = mergeTwoLists(root, root.next);
        return root;
    }
    
     Node mergeTwoLists(Node a, Node b) {
         
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data < b.data) {
            result = a;
            result.bottom = mergeTwoLists(a.bottom, b);
        } else {
            result = b;
            result.bottom = mergeTwoLists(a, b.bottom);
        }

        result.next = null; 
        return result;
    }
}