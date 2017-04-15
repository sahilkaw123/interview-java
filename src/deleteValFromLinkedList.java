/**
 * Created by sahilkaw on 4/9/17.
 */
public class deleteValFromLinkedList {
        Node1 head;
        Node1 current;
        Node1 currDel;

    deleteValFromLinkedList(){
        current = new Node1();
        currDel = new Node1();
    }
    public void createLinkedList(int val){
        if(head ==null){
            Node1 first = new Node1();
            first.data = val;
            head = first;
            current = head;
        }
        else{
            Node1 nxtNode = new Node1();
            nxtNode.data = val;
            current.next = nxtNode;
            current = nxtNode;


        }
    }

    public void print(){
        Node1 current = head;
        //if(head==null){
         //   System.out.println();
       // }
        while(current !=null){
            if(current.next != null) {
                System.out.print(current.data + "-->");

            }
            if(current.next == null){
                System.out.print(current.data);

            }
            current = current.next;


        }
        System.out.println();
    }

    public void deleteVal(int value){
        //System.out.println("xx" + head.data);
        currDel = head;

        Node1 prev = null;

        while(currDel!=null){

            //Data found on the head node
            if((currDel.data == value) && (currDel == head) && (currDel.next !=null)){
                head = head.next;
                currDel = head;
                prev = null;
                //prev =currDel;
            }
            //Data found on the Node apart from head and tail node
            if((currDel.data == value)&&(currDel != head) && ((currDel.next != null))){
                currDel = currDel.next;
                prev.next = currDel;
                //prev =  currDel;


            }
            //If only single node is left to delete
            if((currDel.data == value)&& (head.next == null) &&(currDel.next ==null)){
                head = null;
                currDel = head;
                break;
            }
            // Deletion of tail node with more than one node in LinkedList
            if((currDel.data == value)&&(currDel.next == null) &&(head.next != null)){
                //currDel = null;
                currDel = currDel.next;
                prev.next = null;
                break;

            }

            // If data not found
            if(currDel.data !=value) {
                prev = currDel;
                currDel = currDel.next;

            }
        }

    }


    public static void main(String[]args){
        deleteValFromLinkedList del = new deleteValFromLinkedList();
        del.createLinkedList(7);
        del.createLinkedList(2);
        //del.createLinkedList(8);
        del.createLinkedList(2);
        del.createLinkedList(7);

        del.print();

        del.deleteVal(7);
        //del.deleteVal(2);
        del.deleteVal(8);

        del.print();
    }



}

class Node1{

    Node1 next;
    int data;
}
