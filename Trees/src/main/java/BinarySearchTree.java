import com.sun.org.apache.xpath.internal.operations.Bool;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by mrinali.rao on 13/04/16.
 */
public class BinarySearchTree {

    //points to remember
    //Maximum width of a binary tree at depth h is 2^h

    public static Node croot, root,head;
    public static int path[] = new int[100];
    public static int pathlevel = 0;
    public static int countLeaf;
    public static int height = 0;
    public static int in[] = new int[]{4, 2, 5, 1, 3};
    public static int bst[] = new int[]{10, 5, 1, 7, 40, 50};
    public static int pre[] = new int[]{1, 2, 4, 5, 3};
    public static int[] count1 = new int[10];
    public static boolean b = false;
    public static int numOfNodes;
    public static int res;
    public static NewNode root1;
    public static int d1=-1,d2=-1,dist=0;

    public static class Node {
        int key;
        Node left, right;
        Boolean rightThread;

        public Node(int item) {
            this.key = item;
            left = right = null;

        }
    }

    public static class NewNode{
        int key;
        NewNode left;
        NewNode right;
        NewNode nextRight;

        public NewNode(int data){
            this.key=data;
            this.left=null;
            this.right=null;
            this.nextRight=null;
        }
    }

    @Test
    public static void main() {

//        croot = new Node(50);
//        croot.right = new Node(2);
//        croot.left = new Node(7);
//        croot.left.left = new Node(3);
//        croot.left.right = new Node(5);
//        croot.right.left = new Node(1);
//        croot.right.right = new Node(30);
//
//        root = new Node(1);
//        root.right = new Node(3);
//        root.left = new Node(2);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

        //printvertical -root
//        root = new Node(1);
//        root.right = new Node(3);
//        root.left = new Node(2);
//        root.left.right = new Node(4);
//        root.left.right.right = new Node(5);
//        root.left.right.right.right = new Node(6);

        // maxDiffInTree
//        root = new Node(8);
//        root.left = new Node(3);
//
//        root.left.left = new Node(1);
//        root.left.right = new Node(6);
//        root.left.right.left = new Node(4);
//        root.left.right.right = new Node(7);
//
//        root.right = new Node(10);
//        root.right.right = new Node(14);
//        root.right.right.left = new Node(13);

//        root = new Node(10);
//        root.left = new Node(12);
//        root.right = new Node(15);
//        root.left.left = new Node(25);
//        root.left.right = new Node(30);
//        root.right.left = new Node(36);

        //connect adjacent nodes in tree
//        root1 = new NewNode(10);
//        root1.left = new NewNode(8);
//        root1.right = new NewNode(2);
//        root1.left.left = new NewNode(3);
//        inorderroot(root1);
//        System.out.println("--------------------------");


        //root.right.right = new Node(7);
        //inorder(root);
        //preorder(root);
        //postorder(root);
        //System.out.println(height(root));
        //BFS(root);
        //inorderIterativeWithStack(root);
        //inorderWithoutStack(root);
        //System.out.println(treeSize(root));
        //System.out.println(identicalTrees(root, nextroot));
//        inorder(root);
//        mirrorOfTree(root);
//        inorder(root);
        //printPath(root,path,pathlevel);
        // System.out.println(countLeaf(root));
        //levelOrderInSpiral(root);
        //inorder(croot);
        //convertTreeToChildrenSumProp(croot);
        //System.out.println("\n");
        //inorder(croot);
        // System.out.println(diamterOfTree(root));
        //Node newNode = constructTreeFromInorderAndPreOrder(in, pre, 0, in.length-1);
        // inorder(newNode);
        //printRootToLeaf(root,path2, 0);
        // treeToDoubleTree(root);
        //inorder(root);

//        printMaxWidth(root,0,count1);
//        int max = count1[0];
//        for(int j=1;j<count1.length; j++)
//        {
//            if(count1[j]>max)
//                max = count1[j];
//        }
//        System.out.println(max);

        //  System.out.println(isFoldable(root, root));
        // kthNodesFromRoot(root,3);
//        numOfNodes = countNodes(root);
//        System.out.println(completeBinTreeOrNot(root, 0, numOfNodes));
        //  printNodesAtKth(root,2);
        //      printTreeZigZag(root);
        //     printAncestors(root, 4);
        //     binTreeToDLL(root,null,dhead);
//        root = constructBSTFromPre(bst,bst.length,0,bst[0],Integer.MAX_VALUE,Integer.MIN_VALUE);
//        inorder(root);
        //      System.out.println(findLCA(root, 4, 6).key);
        //      printZigZagUsingStack(root);
//        printTreeVertical(root,0);
//        for(int k:mymap.keySet()){
//            System.out.println(k + "-->" + mymap.get(k).toString());
//        }
//        int h= height(root);
//        for (int i = 1; i <= h; i++) {
//            topViewOfTree(root, 0, i);
//        }
//        for(int k:mappy.keySet()){
//            System.out.println( mappy.get(k));
//        }

        //       topViewUsingQueue(root);
//           res = Integer.MIN_VALUE;
//          maxDiffInTree(root);
//        System.out.println(res);

//        head = null;
//        binTreetoDoublyLinkedList(root,head,prev);
//        while(head!=null) {
//            System.out.print(head.key);
//            head = head.right;
//        }
//        head = convertQtoDLL(root);
//        while (head != null) {
//            System.out.print(head.key + " ");
//            head = head.right;
//        }
//        connectNodesAtSameLevel(root1);
//
//        int a = root1.nextRight != null ? root1.nextRight.key : -1;
//        System.out.println("nextRight of " + root1.key + " is "
//                + a);
//        int b = root1.left.nextRight != null ? root1.left.nextRight.key : -1;
//        System.out.println("nextRight of " + root1.left.key + " is "
//                + b);
//        int c=root1.right.nextRight != null ? root1.right.nextRight.key : -1;
//        System.out.println("nextRight of " + root1.right.key + " is "
//                + c);
//        int d = root1.left.left.nextRight != null ? root1.left.left.nextRight.key : -1;
//        System.out.println("nextRight of " + root1.left.left.key + " is "
//                + d);
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);

//        findDistBetTwoNodes(root,4,5,d1,d2,dist,0);
//        if(d1!=-1 && d2!=-1){
//            System.out.println(dist);
//        }
//           else if(d1==-1){
//            dist= findLevel(root,5,0);
//            System.out.println(dist);
//        }
//        else if(d2==-1){
//            dist= findLevel(root,4,0);
//            System.out.println(dist);
//        }

        System.out.println(findDist(root,4,8));
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);

    }
    public static void inorderroot(NewNode root1) {
        if (root1 == null)
            return;
        inorderroot(root1.left);
        System.out.print(root1.key + " ");
        inorderroot(root1.right);

    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.println(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.key + " ");
    }

    public static void BFS(Node root) {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.print("\n");
        }
    }

    public static void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.key + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void inorderIterativeWithStack(Node root) {
        if (root == null)
            return;
        Stack<Node> s = new Stack<Node>();
        while (!s.empty() || root != null) {
            if (root != null) {
                s.push(root);
                root = root.left;
            } else {
                Node n = s.pop();
                System.out.println(n.key + " ");
                root = n.right;
            }
        }
    }

    //https://codeoverflow.wordpress.com/tag/morris-inorder-traversal/
    public static void inorderWithoutStack(Node root) {
        if (root == null)
            return;
        Node curr = root;
        Node pre;
        while (curr != null) {
            if (curr.left == null) {
                System.out.println(curr.key + " ");
                curr = curr.right;
            } else {
                pre = curr.left;
                while (pre.right != null && pre.right != curr)
                    pre = pre.right;
                if (pre.right == null) {
                    pre.right = curr;
                    curr = curr.left;
                } else {
                    pre.right = null;
                    System.out.println(curr.key + " ");
                    curr = curr.right;
                }
            }
        }

    }

    public static Node leftMost(Node root) {
        if (root == null)
            return null;
        while (root.left != null)
            root = root.left;
        return root;
    }

    //single threaded binary tree
    public static void inorderThreadedTree(Node root) {
        Node curr = leftMost(root);
        while (curr != null) {
            System.out.println(curr.key + " ");
            if (curr.rightThread)
                curr = curr.right;
            else
                curr = leftMost(curr.right);
        }
    }

    public static int treeSize(Node root) {
        if (root == null)
            return 0;
        else {
            return 1 + treeSize(root.left) + treeSize(root.right);
        }
    }

    public static Boolean identicalTrees(Node root, Node nextroot) {
        if (root == null && nextroot == null)
            return true;
        else {
            return (root.key == nextroot.key && identicalTrees(root.left, nextroot.left) && identicalTrees(root.right, nextroot.right));
        }
    }

    public static void mirrorOfTree(Node root) {
        if (root == null)
            return;
        else {
            Node temp;
            mirrorOfTree(root.left);
            mirrorOfTree(root.right);

            //swap
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }

    public static void printPath(Node root, int path[], int pathlen) {
        if (root == null)
            return;
        path[pathlen] = root.key;
        pathlen++;

        if (root.right == null && root.left == null) {
            for (int i = 0; i < pathlen; i++) {
                System.out.print(path[i]);
            }
            System.out.println("\n");
        } else {
            printPath(root.left, path, pathlen);
            printPath(root.right, path, pathlen);
        }
    }

    public static int countLeaf(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            countLeaf++;
        else {
            countLeaf(root.left);
            countLeaf(root.right);
        }
        return countLeaf;
    }

    public static void levelOrderInSpiral(Node root) {
        int h = height(root);
        Boolean b = false;
        for (int i = 1; i <= h; i++) {
            printLevelInSpiral(root, i, b);
            b = !b;
        }
    }

    public static void printLevelInSpiral(Node root, int level, boolean b) {
        if (root == null)
            return;
        if (level == 1)
            System.out.println(root.key + " ");
        if (b) {
            printLevelInSpiral(root.left, level - 1, b);
            printLevelInSpiral(root.right, level - 1, b);
        } else {
            printLevelInSpiral(root.right, level - 1, b);
            printLevelInSpiral(root.left, level - 1, b);
        }
    }

    public static void convertTreeToChildrenSumProp(Node croot) {
        int leftdata = 0, rightdata = 0, diff;
        if (croot == null || (croot.right == null && croot.left == null))
            return;
        else {
            convertTreeToChildrenSumProp(croot.left);
            convertTreeToChildrenSumProp(croot.right);

            if (croot.left != null)
                leftdata = croot.left.key;
            if (croot.right != null)
                rightdata = croot.right.key;
            diff = croot.key - (leftdata + rightdata);
            if (diff < 0)
                croot.key = leftdata + rightdata;
            else if (diff > 0) {
                incre(croot, diff);
            }

        }
    }

    public static void incre(Node croot, int diff) {
        if (croot.left != null) {
            croot.left.key += diff;
            incre(croot.left, diff);
        } else if (croot.right != null) {
            croot.right.key += diff;
            incre(croot.right, diff);
        }
    }

    public static int diamterOfTree(Node root) {
        int leftheight = 0, rightheight = 0;
        if (root == null)
            return 0;
        else {

            leftheight = height(root.left);
            rightheight = height(root.right);
            if (leftheight + rightheight + 1 > height)
                height = leftheight + rightheight + 1;

            diamterOfTree(root.left);
            diamterOfTree(root.right);


        }
        return height;
    }

    public static int preindex = 0;
    public static int index;

    //in: 4 2 5 1 3
    //pre: 1 2 4 5 3

    public static Node constructTreeFromInorderAndPreOrder(int[] in, int[] pre, int start, int end) {

        if (start > end)
            return null;

        Node temp = new Node(pre[preindex++]);

        if (start == end)
            return temp;

        for (int i = start; i <= end; i++) {
            if (in[i] == temp.key) {
                index = i;
            }
        }

        temp.left = constructTreeFromInorderAndPreOrder(in, pre, start, index - 1);
        temp.right = constructTreeFromInorderAndPreOrder(in, pre, index + 1, end);

        return temp;

    }

    public static int i;
    public static int path2[] = new int[10];

    public static void printRootToLeaf(Node head, int[] path2, int i) {

        Node temp = head;
        if (head == null)
            return;

        else if (temp.right == null && temp.left == null) {
            path2[i++] = temp.key;
            for (int j = 0; j < i; j++)
                System.out.print(path2[j] + " ");
            System.out.println(" ");

        } else {
            path2[i++] = temp.key;
            printRootToLeaf(temp.left, path2, i);
            printRootToLeaf(temp.right, path2, i);
        }
    }

    //http://www.geeksforgeeks.org/double-tree/
    public static void treeToDoubleTree(Node root) {
        if (root == null)
            return;
        Node temp = new Node(0);
        temp.key = root.key;
        temp.left = root.left;
        root.left = temp;
        treeToDoubleTree(temp.left);
        treeToDoubleTree(root.right);
    }


    //http://www.geeksforgeeks.org/maximum-width-of-a-binary-tree/
    public static void printMaxWidth(Node root, int h1, int count1[]) {
        if (root != null) {
            count1[h1]++;
            printMaxWidth(root.left, h1 + 1, count1);
            printMaxWidth(root.right, h1 + 1, count1);

        }

    }

    public static boolean isFoldable(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        return (root1 != null && root2 != null && isFoldable(root1.left, root2.right) && isFoldable(root1.right, root2.left));

    }

    //http://www.geeksforgeeks.org/print-nodes-at-k-distance-from-root/
    public static void kthNodesFromRoot(Node root, int k) {
        if (k == 1 && root != null)
            System.out.println(root.key);
        else if (root == null)
            return;
        else {
            kthNodesFromRoot(root.left, k - 1);
            kthNodesFromRoot(root.right, k - 1);
        }
    }

    //check if binary tree is complete or not.
    //in a complete binary tree the index of the node is always less than the total number of nodes
    //http://www.geeksforgeeks.org/check-whether-binary-tree-complete-not-set-2-recursive-solution/

    public static Boolean completeBinTreeOrNot(Node head, int index, int numOfNodes) {

        if (head == null)
            return true;

        if (index >= numOfNodes)
            return false;
        return (completeBinTreeOrNot(head.left, 2 * index + 1, numOfNodes) && completeBinTreeOrNot(head.right, 2 * index + 2, numOfNodes));


    }

    public static int countNodes(Node head) {
        if (head == null)
            return 0;
        return (1 + countNodes(head.left) + countNodes(head.right));
    }

    public static void printNodesAtKth(Node head, int level) {
        if (head == null)
            return;
        if (level == 0) {
            System.out.print(head.key + " ");
            return;
        } else {
            printNodesAtKth(head.left, level - 1);
            printNodesAtKth(head.right, level - 1);
        }
    }

    public static void printTreeZigZag(Node root) {
        //1
        //2  3
        //4 5  6 7
        int h = height(root);
        inorder(root);
        System.out.println();
        Boolean b = true;
        for (int i = 1; i <= h; i++) {
            printzigzag(root, i, b);
            b = !b;
        }
    }

    public static void printzigzag(Node root, int level, Boolean b) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else {
            if (!b) {
                printzigzag(root.left, level - 1, b);
                printzigzag(root.right, level - 1, b);
            } else {
                printzigzag(root.right, level - 1, b);
                printzigzag(root.left, level - 1, b);
            }
        }

    }

    public static void binaryTreeToBST(Node root) {
        if (root == null)
            return;
        int n = newNumOfNodes(root);
        int[] arr = new int[n];
        storeInOrder(root, arr, 0);


    }

    public static int newNumOfNodes(Node root) {
        if (root == null)
            return 0;
        else {
            return (1 + newNumOfNodes(root.right) + newNumOfNodes(root.left));
        }
    }

    public static void storeInOrder(Node root, int[] arr, int i) {
        if (root == null)
            return;
        storeInOrder(root.left, arr, i);
        arr[i] = root.key;
        i++;

        storeInOrder(root.right, arr, i);
        // mergeSort(arr);
        arrayToBST(arr, root, 0);

    }

    public static void arrayToBST(int[] arr, Node root, int i) {
        if (root == null)
            return;
        arrayToBST(arr, root.left, i);

        root.key = arr[i];
        i++;

        arrayToBST(arr, root.right, i);
    }

    public static Boolean printAncestors(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;
        if (printAncestors(root.left, key) || printAncestors(root.right, key)) {
            System.out.print(root.key + " ");
            return true;
        }
        return false;
    }

    public static void binTreeToDLL(Node root, Node[] curr, Node[] head) {
        if (root == null)
            return;
        binTreeToDLL(root.left, curr, head);

        if (head[0] == null)
            head[0] = root;
        else {
            curr[0].right = root;
        }
    }

    //given preorder construct binary tree
    //10, 5, 1, 7, 40, 50
    //http://www.geeksforgeeks.org/construct-bst-from-given-preorder-traversa/
    //not working
    public static Node constructBSTFromPre(int[] bst, int size, int index, int key, int max, int min) {

        if (index >= size)
            return null;
        Node root = null;

        if (key < max && key > min) {
            root = new Node(key);
            index++;
            if (index < size) {
                root.left = constructBSTFromPre(bst, size, index, bst[index], key, min);
                root.right = constructBSTFromPre(bst, size, index, bst[index], max, key);
            }
        }
        return root;
    }

    public static Node findLCA(Node root, int n1, int n2){
        if(root == null)
            return null;
        Node temp = root;
        if(root.key == n1 || root.key == n2)
            return root;

            root.left = findLCA(root.left,n1, n2);
            root.right = findLCA(root.right, n1, n2);
        if(root.left!=null && root.right!=null)
            return root;

        return (root.left!=null? root.left:root.right);
    }

    public static void printZigZagUsingStack(Node root){
        if(root == null)
            return;
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        s1.push(root);

        while(!s1.isEmpty()|| !s2.isEmpty()){

            while(!s1.isEmpty()){
                Node temp = s1.pop();
                System.out.println(temp.key);

                if(temp.right!=null)
                    s2.push(temp.right);
                if(temp.left!=null)
                    s2.push(temp.left);
            }

            while(!s2.isEmpty()){
                Node temp = s2.pop();
                System.out.println(temp.key);

                if(temp.left!=null)
                    s1.push(temp.left);
                if(temp.right!=null)
                    s1.push(temp.right);
            }
        }
    }

    //print vertical tree
    //http://www.geeksforgeeks.org/print-binary-tree-vertical-order-set-2/
    //        1
    //     2     3
    //  4    5 6    7
    //           8    9
    //output:
//            4
//            2
//            1 5 6
//            3 8
//            7
//            9
    public static HashMap<Integer,ArrayList<Integer>> mymap = new HashMap<Integer, ArrayList<Integer>>();

    public static void printTreeVertical(Node root, int hd){
        if(root==null)
            return;

        if(mymap.containsKey(hd)){
            mymap.get(hd).add(root.key);
        }
        else{
            ArrayList<Integer> arrlist = new ArrayList<Integer>();
            arrlist.add(root.key);
            mymap.put(hd,arrlist);
        }

        printTreeVertical(root.left,hd -1);
        printTreeVertical(root.right,hd + 1);

    }
    public static HashMap<Integer,Integer> mappy = new HashMap<Integer, Integer>();
    public static void topViewOfTree(Node root,int hd,int height){
        if(root == null)
            return;
        if(height==1) {
            if (!mappy.containsKey(hd))
                mappy.put(hd, root.key);
        }

        topViewOfTree(root.left, hd-1,height-1);
        topViewOfTree(root.right,hd+1,height-1);
    }

    //using queues:
    //http://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/
    public static class QItem{
        Node root;
        int hd;
        public QItem(Node root, int hd){
            this.root = root;
            this.hd = hd;
        }
    }
    public static void topViewUsingQueue(Node root) {
        if(root==null)
            return;
        HashSet<Integer> hs = new HashSet<Integer>();
        Queue<QItem> q = new LinkedList<QItem>();
        q.add(new QItem(root,0));
        //hs.add(hd);
        while (!q.isEmpty()) {
            QItem qitem= q.remove();
            int hd = qitem.hd;
            Node n = qitem.root;
            if(!hs.contains(hd)){
                hs.add(hd);
                System.out.println(n.key);

            }
            if(n.left!=null) {
                q.add(new QItem(n.left,hd-1));
            }

            if(n.right!=null) {
                q.add(new QItem(n.right,hd+1));
            }
        }
    }
    //   3
    //2    1
    //find max diff between a node and its ancestor
    public static int maxDiffInTree(Node root){
        if(root ==null)
            return Integer.MAX_VALUE;
        if(root.right==null && root.left==null)
            return root.key;
        int val = Math.min(maxDiffInTree(root.left), maxDiffInTree(root.right));
        res = Math.max(root.key-val,res);

        return Math.min(val, root.key);
    }

    //convert Binary Tree to DLL
    //http://www.geeksforgeeks.org/convert-given-binary-tree-doubly-linked-list-set-3/
    public static Node prev;
    public static void binTreetoDoublyLinkedList(Node root, Node head, Node prev){
        if(root == null)
            return;

        //prev=null;
        binTreetoDoublyLinkedList(root.left,head,prev);
        if(prev==null)
            head= root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        binTreetoDoublyLinkedList(root.right,head,prev);
    }

    //WORKING METHOD TO CONVERT BIN TREE TO A DLL
    public static Queue<Node> retQueue(Node root, Queue<Node> q) {
        if (root == null)
            return q;
      q =  retQueue(root.left, q);
        q.add(root);
       q = retQueue(root.right, q);
        return q;
    }

    public static Node convertQtoDLL(Node root){
        Queue<Node> q = new LinkedList<Node>();
        q = retQueue(root,q);
        Node head=q.remove();
        Node curr= head;
        while(!q.isEmpty()) {
            Node temp = q.remove();
            curr.right = temp;
            temp.left = curr;
            curr = temp;
        }
        return head;
    }

    //connect nodes at same level in binary tree
    //http://javabypatel.blogspot.in/2015/08/connect-nodes-at-same-level-in-binary-tree.html
   //https://www.quora.com/How-do-you-link-nodes-at-same-level-in-a-binary-tree
    public static void connectNodesAtSameLevel(NewNode root1){
        if(root1==null) return;
        Queue<NewNode> q = new LinkedList<NewNode>();
        q.add(root1);
        q.add(null);

        while(!q.isEmpty()) {
            NewNode temp = q.remove();

            if (temp != null) {
                temp.nextRight = q.peek();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            } else if (temp == null) {
                if (q.size() != 0)
                    q.add(null);
            }
        }
    }

    //find the distance btw two nodes
    //http://www.geeksforgeeks.org/find-distance-two-given-nodes/
    //difficult way
    public static Node findDistBetTwoNodes(Node root,int n1, int n2, int d1, int d2, int dist, int level){
        if(root==null)
            return null;
        if(root.key==n1){
            d1= level+1;
            return root;
        }
        if(root.key==n2){
            d2=level+1;
            return root;
        }
        root.left = findDistBetTwoNodes(root.left,n1,n2,d1,d2,dist,level+1);
        root.right= findDistBetTwoNodes(root.right,n1,n2,d1,d2,dist,level+1);

        if(root.left!=null && root.right!=null){
            dist= d1+d2 - 2*level;
            return  root;
        }
        else return(root.left==null?root.right:root.left);
    }

    public static int findLevel(Node root, int n, int level){
        if(root==null)
            return -1;
        if(root.key==n)
            return level;
        int l=findLevel(root.left,n,level+1);
        return(l!=-1?l:findLevel(root.right,n,level+1));
    }

    //find dist between two nodes
    //http://algorithms.tutorialhorizon.com/find-the-distance-between-two-nodes-of-a-binary-tree/

    //algo to find LCA
    public static Node findLCA2(Node root, int n1, int n2){
        if(root==null)
            return null;
        if(root.key == n1 || root.key == n2){
            return root;
        }
        root.left = findLCA2(root.left, n1, n2);
        root.right = findLCA2(root.right, n1, n2);
        if(root.right!=null && root.left!=null)
            return root;
        return(root.left==null?root.right:root.left);
    }

    //algo to get the distance of the node from root
    public static int pathLength(Node root,int n){
        if(root ==null)
            return 0;
        int x =0;
        if((root.key==n)||(x=pathLength(root.left,n))>0 || (x=pathLength(root.right,n))>0)
            return x+1;
        else return 0;
    }

    //algo to find dist between two nodes
    public static int findDist(Node root,int n1, int n2){
        int x = pathLength(root,n1)-1;
        int y = pathLength(root,n2)-1;
        int z = pathLength(root,findLCA2(root,n1,n2).key)-1;
        int distance = x+y -2*z;

        return distance;
    }




    }





////0 0 1 0 0 1 1 1 find element
//level order traversal in binary tree
//abcdxyabcxy


