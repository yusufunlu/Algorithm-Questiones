package codesignal.linkedlist;

/**
 * Created by yusufunlu on 19.04.2021
 */

public class LinkedListTry {

    ListNode head;
    public static void main(String[] args) {

        LinkedListTry llist = new LinkedListTry();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);
        llist.append(100);
        llist.printList();

        ListNode<Integer> nodes = new ListNode<Integer>(3);
        nodes.next = new ListNode<Integer>(1);
        nodes.next.next = new ListNode<Integer>(2);
        nodes.next.next.next = new ListNode<Integer>(3);
        nodes.next.next.next.next = new ListNode<Integer>(4);
        removeKFromList(nodes,3);


    }

    static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        if(l == null) {
            return l;
        }

        boolean isFirstSame = false;
        ListNode<Integer> index = l;

        if(index.value==k){
            isFirstSame = true;
        }

        while (index.next != null){
            if(index.next.value==k){
                index.next=index.next.next;
            } else {
                index = index.next;
            }
        }
        if(isFirstSame){
            return l.next;
        } else {
            return l;
        }
    }

    /* Given a key, deletes the first
    occurrence of key in
  * linked list */
    void deleteNode(int key)
    {
        // Store head node
        ListNode temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.value.equals(key)) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.value.equals(key)) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }
    
    /* Inserts a new ListNode at front of the list. */
    public void push(int new_data)
    {
        ListNode new_node = new ListNode(new_data);
        new_node.next = head;
        head = new_node;
    }
    /* Appends a new node at the end.  This method is 
       defined inside LinkedList class shown above */
    public void append(int new_data)
    {
    /* 1. Allocate the ListNode &
       2. Put in the value
       3. Set next as null */
        ListNode new_node = new ListNode(new_data);
  
    /* 4. If the Linked List is empty, then make the
           new node as head */
        if (head == null)
        {
            head = new ListNode(new_data);
            return;
        }
  
    /* 4. This new node is going to be the last node, so
         make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        ListNode last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
    /* This function prints contents of linked list starting
   from the given node */
    public void printList()
    {
        ListNode tnode = head;
        while (tnode != null) {
            System.out.print(tnode.value + " ");
            tnode = tnode.next;
        }
    }

    //Singly-linked lists are already defined with this interface:
    static class ListNode<T> {
        protected T value;
        ListNode<T> next;
        ListNode(T x) {
            value = x;
        }
    }
}
