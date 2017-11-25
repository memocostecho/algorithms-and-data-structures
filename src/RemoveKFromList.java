/**
 * Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in the list, since this is what you'll be asked to do during an interview.
 * <p>
 * Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k.
 * <p>
 * Example
 * <p>
 * For l = [3, 1, 2, 3, 4, 5] and k = 3, the output should be
 * removeKFromList(l, k) = [1, 2, 4, 5];
 * For l = [1, 2, 3, 4, 5, 6, 7] and k = 10, the output should be
 * removeKFromList(l, k) = [1, 2, 3, 4, 5, 6, 7].
 */
public class RemoveKFromList {

    private static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

        ListNode current = l;
        ListNode next = l.next;

        while (next != null) {
            if (current.value.equals(k)) {
                current.next = null;
            }

            if (next.value.equals(k)) {
                current.next = next.next;
                if(next.next != null) {
                    current = next.next;
                }
                next.next = null;
                next = current.next;
            } else {
                current = next;
                next = current.next;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        ListNode nodo1 = new ListNode<>(1);
        ListNode nodo2 = new ListNode<>(3);
        ListNode nodo3 = new ListNode<>(5);
        ListNode nodo4 = new ListNode<>(6);
        ListNode nodo5 = new ListNode<>(3);
        ListNode nodo6 = new ListNode<>(8);
        ListNode nodo7 = new ListNode<>(10);
        nodo1.next = nodo2;
        nodo2.next = nodo3;
        nodo3.next = nodo4;
        nodo4.next = nodo5;
        nodo5.next = nodo6;
        nodo6.next = nodo7;

        removeKFromList(nodo1, 3);
    }

}

class ListNode<T> {
    ListNode(T x) {
        value = x;
    }

    T value;
    ListNode<T> next;
}


