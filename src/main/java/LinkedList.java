import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by mrinali.rao on 08/04/16.
 */
public class LinkedList {

    public static Node head;
    public static Node first;
    public static Node mid;

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
        }
    }

    @Test
    public static void main() {

        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
       Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        head.next = second;
        second.next = third;
        third.next = fourth;
       // third.next=fourth;
        fourth.next = fifth;
       fifth.next = sixth;
        sixth.next = null;

        first = new Node(1);
        Node second2 = new Node(1);
      //  Node third2 = new Node(3);
//        Node fourth2 = new Node(7);
//
        first.next = second2;
        second2.next = null;
  //      third2.next = null;
//        fourth2.next = null;

        //printList();
        //swap(2,4);
        //printMiddleByGettingCount();
        //printMiddleByPointer();
        // nthNodeFromEnd(4);
        //detectLoop();
        //head=mergeSortedList(head,first);
        //head = mergeIterative(head,first);
        //insertInSorted(head,4);
        //head = revList(head);
        //mid = midListAgain(head);
        //checkPalin(head);
        //boolean p = checkPalinRecurs(head,head);
        //int n = getLen(head);

        //intersectList(head,first);
        //head = removeDuplicates(head);
        //head = pairwiseSwap(head);
        //head = delAlternate(head);
        //head = detectLoop(head);
        //head = addTwoList(head, first);
        //  head = rotateList(head,4);
        //head = sort012(head);
        // head = mergeAlt(head, first);
        //head = swapLink(head);
        //printList();
       // addTwoLinkedList(head,first);
        head = changeList(head);
        printList();

    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public static void swap(int x, int y) {

        //if x==y
        if (x == y) {
            return;
        }
        //find the value of currX and prevX
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        //find the value of currY and prevY
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            System.out.println("x and y not found");
            return;
        }

        //if currX is not the head
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        //if currY is not the head
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        //swap the remaining pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

    }


    public static void printMiddleByGettingCount() {

        int count = 1, length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        System.out.println("length" + length);

        temp = head;
        while (count <= length / 2) {

            count++;
            temp = temp.next;
        }
        System.out.println(temp.data + "is the middle element");

    }

    public static void printMiddleByPointer() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("middle:" + slow.data);
    }


    public static void nthNodeFromEnd(int pos) {

        int count = 1;
        Node prev = head, nxt = head;
        while (count != pos) {
            nxt = nxt.next;
            count++;
        }

        while (nxt.next != null) {
            prev = prev.next;
            nxt = nxt.next;
        }
        System.out.println(prev.data);
    }

    //Floyds-cycle finding algo
    public static void detectLoop() {

        Node prev = head, nxt = head;
        while (nxt != null && nxt.next != null && prev != null) {
            nxt = nxt.next.next;
            prev = prev.next;

            if (prev == nxt) {
                System.out.println("loop found");
                return;
            }
        }
    }

    public static Node mergeSortedList(Node first, Node second) {
        Node res = null;
        if (first == null)
            return second;
        else if (second == null)
            return first;
        if (first.data <= second.data) {
            res = first;
            res.next = mergeSortedList(first.next, second);
        } else {
            res = second;
            res.next = mergeSortedList(first, second.next);
        }
        return res;
    }

    public static Node mergeIterative(Node head, Node first) {
        Node p = new Node(0);
        Node res = p;
        Node one = head, two = first;
        while (one != null && two != null) {
            if (one.data <= two.data) {
                res.next = one;
                one = one.next;
            } else {
                res.next = two;
                two = two.next;
            }
            res = res.next;
        }
        if (one != null) {
            res.next = one;
        }
        if (two != null) {
            res.next = two;
        }
        return p.next;
    }

    public static void insertInSorted(Node head, int val) {
        Node temp = head;
        Node ins = new Node(val);
        Node nxt;
        while (temp.next.data <= val && temp != null) {
            temp = temp.next;
        }
        nxt = temp.next;
        temp.next = ins;
        ins.next = nxt;

    }

    public static Node revList(Node head) {

        Node temp = head;
        Node curr = head, prev = null;
        while (temp.next != null) {
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        curr.next = prev;
        return curr;
    }

    public static Node midListAgain(Node head) {
        Node prev = head, nxt = head;
        while (nxt.next != null && nxt.next.next != null) {
            prev = prev.next;
            nxt = nxt.next.next;
        }
        //System.out.println(prev.data);
        return prev;

    }

    public static void checkPalin(Node head) {
        Node temp = head;
        mid = midListAgain(temp);
        Node newlist = revList(mid.next);


        while (temp != mid && newlist != null) {
            if (temp.data != newlist.data) {
                System.out.println("not a palin");
                return;
            }
            temp = temp.next;
            newlist = newlist.next;
        }
        if (temp.data != newlist.data) {
            System.out.println("not a palin");
        } else
            System.out.println("palindrome");

    }

    //not working
    public static boolean checkPalinRecurs(Node one, Node two) {

        boolean x = true;

        if (two == null)
            return true;

        x = checkPalinRecurs(one, two.next);

        if (x == false) return false;
        boolean y = false;

        if (one.data == two.data) {
            y = true;
        }
        one = one.next;
        return y;

    }

    public static int getLen(Node head) {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        System.out.println("length:" + len);
        return len;
    }

    public static void intersectList(Node head, Node first) {
        Node one = head, two = first;
        int count = 1;
        int a = getLen(head);
        int b = getLen(first);
        if (a > b) {
            while (count <= (a - b)) {
                count++;
                one = one.next;
            }

        } else if (a < b) {
            while (count <= (b - a)) {
                count++;
                two = two.next;
            }
        }
        while (one.data != two.data && one != null && two != null) {
            one = one.next;
            two = two.next;
        }
        System.out.println("intersection:" + one.data);

    }

    public static Node removeDuplicates(Node head) {
        Node temp = head;
        HashMap<Integer, Boolean> mymap = new HashMap<Integer, Boolean>();
        while (temp != null) {
            if (mymap.containsKey(temp.data))
                head = deleteNode(temp, head);
            else
                mymap.put(temp.data, true);
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteNode(Node temp, Node head) {
        Node start = head;
        while (start.next != temp) {
            start = start.next;
        }
        start.next = temp.next;
        temp = null;
        return head;

    }

    public static Node pairwiseSwap(Node head) {

        Node temp = head;
        while (temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
        return head;
    }

    public static Node delAlternate(Node head) {
        Node temp = head;
        Node curr = null;
        while (temp.next != null) {
            curr = temp.next;
            temp.next = curr.next;
            curr = null;
            if (temp.next != null)
                temp = temp.next;
        }
        return head;
    }

    public static Node detectLoop(Node head) {
        //Flyods algo
        Node slow = head, fast = head;
        while (slow != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //slow.next = null;
                fast.next.next=null;
            }
        }
        return head;
    }

    public static Node addTwoList(Node head, Node first) {
        Node one = head, two = first;
        int dat, carry = 0;
        Node dummy = new Node(0);
        Node temp = dummy;
        while (one != null && two != null) {
            if ((one.data + two.data + carry) < 10) {
                dummy.data = one.data + two.data + carry;
                dummy.next = new Node(0);
                dummy = dummy.next;
                one = one.next;
                two = two.next;
            } else {
                dat = (one.data + two.data - 10);
                carry = 1;
                dummy.data = dat;
                dummy.next = new Node(0);
                dummy = dummy.next;
                one = one.next;
                two = two.next;

            }
        }
        if (one != null) {
            dummy.data = one.data + carry;
            carry = 0;
            dummy.next = new Node(0);
            dummy = dummy.next;
        }

        if (two != null) {
            dummy.data = two.data + carry;
            carry = 0;
            dummy.next = new Node(0);
            dummy = dummy.next;
        }
        Node dummy2 = temp;
        while (dummy2.next != dummy) {
            dummy2 = dummy2.next;
        }
        dummy2.next = null;

        return temp;

    }

    public static Node rotateList(Node head, int k) {
        Node temp = head;
        int count = 1;
        Node prev = head, curr = head;
        while (count != k) {
            count++;
            curr = curr.next;
        }
        while (prev.next != curr) {
            prev = prev.next;
        }
        prev.next = null;
        head = curr;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static Node sort012(Node head) {
        int[] count = {0, 0, 0};
        Node temp = head;
        while (temp != null) {
            count[temp.data]++;
            temp = temp.next;

        }
        temp = head;
        int i = 0, cnt2 = 0;
        System.out.println(count[i]);
        while (temp != null) {
            while (count[i] != cnt2) {
                temp.data = i;
                cnt2++;
                temp = temp.next;
            }
            i++;
            cnt2 = 0;
        }
        return head;

    }

    public static Node mergeAlt(Node head, Node first) {
        int len1 = getLen(head);
        int len2 = getLen(first);
        int len;
        if (len1 < len2)
            len = len1;
        else
            len = len2;

        Node one = head, two = first;
        Node onenxt = null, twonxt = null;
        int count = 1;
        while (count != len && one.next != null && two.next != null) {
            onenxt = one.next;
            twonxt = two.next;
            one.next = two;
            two.next = onenxt;
            one = onenxt;
            two = twonxt;
            count++;
        }
        one.next = two;
        //two.next = null;
        return head;
    }

    public static Node swapLink(Node head) {

        Node one = head, two = head.next;
        while (two != null && one.next != null) {
            head = swapNodes(head, one, two);
            if (one.next != null) {
                one = one.next;
                two = one.next;
            } else
                one.next = null;
        }

        return head;
    }

    public static Node swapNodes(Node head, Node one, Node two) {
        Node temp = head, prev = head;
        while (prev.next != one && prev != one) {
            prev = prev.next;
        }
        if (prev == one) {
            head = two;
            one.next = two.next;
            two.next = one;
            return head;
        }
        prev.next = two;
        one.next = two.next;
        two.next = one;
        return head;
    }

    //addition of two linkedlist using 2 stacks
    public static void addTwoLinkedList(Node head, Node first) {
        Node one = head, two = first;
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> res = new Stack<Integer>();

        while (head != null) {
            s1.push(head.data);
            head = head.next;
        }

        while (first != null) {
            s2.push(first.data);
            first = first.next;
        }

        int sum = 0, carry = 0;
        while (!s1.isEmpty() && !s2.isEmpty()) {
            sum = carry + s1.pop() + s2.pop();
            if (sum < 10) {
                carry = 0;
                res.push(sum);
            } else {
                carry = 1;
                res.push(sum - 10);
            }
            sum = 0;
        }
        while (!s1.isEmpty()) {
            sum = carry + s1.pop();
            if (sum < 10) {
                carry = 0;
                res.push(sum);
            } else {
                carry = 1;
                res.push(sum - 10);
            }
            sum = 0;
        }

        while (!s2.isEmpty()) {
            sum = carry + s2.pop();
            if (sum < 10) {
                carry = 0;
                res.push(sum);
            } else {
                carry = 1;
                res.push(sum - 10);
            }
            sum = 0;

        }
        if(carry==1)
            res.push(carry);

        while (!res.isEmpty()) {
            Node temp = new Node(0);
            temp.data = res.pop();
            System.out.print(temp.data + " -> ");
        }
    }

    //Given a linked list eg : 1->2->3->4->5->6, make the following changes
    //1->6->2->5->3->4
    public static Node changeList(Node head){
        Node mid = findMidOfList(head);
        Node two = revlist(mid);
        System.out.println("mid:" + mid);
        Node one = head;
        //1->2->3->6->5->4
        //one = 1->2->3
        //two = 6->5->4
        while(one!=mid && two.next!=null){
            Node temp1 = one.next;
            Node temp2 = two.next;
            one.next = two;
            two.next = temp1;
            //temp1.next = temp2;
            one = temp1;
            two = temp2;
        }
        one.next = two;
        two.next = null;
        return head;
    }

    public static Node findMidOfList(Node head){
        Node slow = head, fast = head;
        while(slow.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        return slow;
    }

    public static Node revlist(Node head){
        Node prev = null, curr = head, temp = head;
        while(curr.next!=null){
            temp = temp.next;
            curr.next = prev;
            prev= curr;
            curr = temp;
        }
        temp.next = prev;
        return temp;
    }


}








