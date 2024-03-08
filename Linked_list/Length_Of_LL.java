

class Node{
    int data;
    Node next;


    Node(int data, Node next){
        this.data = data;
        this.next=next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}



public class Length_Of_LL {

    public static int LL_Length(Node head){
        int counter=0;
        Node temp = head;
        while(temp != null){
            temp=temp.next;
            counter++;
        }
        return counter;
    }

    public static void main(String args[]){
        int arr[] = {2,5,8,7};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        
        int length =LL_Length(head);
        System.out.println("The length of the given linked list is:" +length);
    }
}
