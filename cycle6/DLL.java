public class DLL{
    class Node{
        int data;
        Node next;
        Node prev;
    
    Node(int data){
        this.data=data;

    }
}
    public Node head;
    public Node tail;
void addNode(int data)
{
    Node newNode=new Node(data);
    if(head.next == null)
       { head=newNode;
       
    }
    else
    {
        tail.next=newNode;
        newNode.prev=tail;
        
    }    
}    

}