/**
 * Created by sahilkaw on 3/28/17.
 */

public class AddLinkedListNum {

    //Finding the length of the LinkedList
    Node head;
    int size;
    Node current;
    int carry = 0;
    Node newHead = null;
    int a = 0;

    AddLinkedListNum(){
        //head = null;
        size = 0;
    }

    //creating the LinkedList
    //add nodes to the linkedList
    public void addList(Node node){
        // If it is the first element
        if(head == null){
            head =node;
            current = head;
        }
        else{
            current.next = node;
            current = node;

        }
        size++;

    }

    public int getSize(){
        return size;
    }

    //printing the linkedlist


    public int getLength(Node head1){
        /*if(head1 == null){
            return 0;
        } */
        Node current = head1;
        int length =0;
        while(current!=null){
            length++;
            current= current.next;

        }
        return length;
    }
    //adding two linkedlist using recursion
    public Node add11(Node n1, Node n2){
        //finding the size of the both linkedlist
        int len1 = getLength(n1);
       // System.out.println("MM" + len1);
        int len2 = getLength(n2);
        //System.out.println("nn" + len2);

        if(len1>len2){
            int diff = len1 - len2;
            while(diff > 0){
                Node n = new Node(0);
                n.next = n2;
                n2 = n;
                diff--;
            }
        }
        else{
            int diff = len2 - len1;
            while(diff >0){
                Node n = new Node(0);
                n.next = n1;
                n1 = n;
                diff--;
            }
        }

        Node newHead = addBackRecurr(n1 , n2);

        //Making last node as carry node and number
        if(carry!=0){
            String carryStr = String.valueOf(carry);
            String num = String.valueOf(newHead.data);
            String val = carryStr + num;
            int value = Integer.parseInt(val);
            Node n = new Node(value);

            n.next = newHead.next;
            newHead = n;

        }
        return newHead;


    }

    //recursively add and save number to the list
    public Node addBackRecurr(Node n1, Node n2){
        if(n1 ==null || n2 ==null){
            return null;
        }
        addBackRecurr(n1.next, n2.next);
        int a = n1.data + n2.data + carry;
        carry = 0;

        if(a>10){
            carry = 1;
            a = a%10;
        }
        Node n = new Node(a);
        if(newHead == null){
            newHead = n;
        }
        else{
            n.next = newHead;
            newHead = n;
        }
        return newHead;

    }
    //displaying the linkedList
    public void display(Node head){
        Node currNode = head;
        while(currNode!= null){
            System.out.print( currNode.data);
            if(currNode.next!=null){
                System.out.print("-->");
            }
            currNode = currNode.next;
        }
        System.out.println();
    }

    //display the printlist
    public void printlist(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data);
            if(curr.next!=null){
                System.out.print("-->");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[]args){
        AddLinkedListNum list1 = new AddLinkedListNum();
        list1.addList(new Node(9));
        list1.addList(new Node(9));
        list1.addList(new Node(5));
        list1.printlist();

        AddLinkedListNum list2 = new AddLinkedListNum();
        list2.addList(new Node(9));
        list2.addList(new Node(9));
        list2.addList(new Node(6));
        list2.printlist();

        AddLinkedListNum list = new AddLinkedListNum();
        Node sum = list.add11(list1.head, list2.head);
        list.display(sum);

        //int x = list1.getSize();
        //System.out.println(x);
        //int y = list2.getSize();
        //System.out.println(y);
        //System.out.println(list1.head.data + " " + list2.head.data);


    }


}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
