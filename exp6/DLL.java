import java.util.Scanner;

public class DLL {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    void InsertAtbeg(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        new_Node.prev = null;
        if (head != null)
            head.prev = new_Node;
        head = new_Node;
    }

    void InsertAfter(Node prev_Node, int new_data) {
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    void InsertAtend(int new_data) {
        Node new_node = new Node(new_data);
        Node last = head;
        new_node.next = null;
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        new_node.prev = last;
    }
    void deleteNode(Node del)
    {
        if (head == null || del == null) {
            return;
        }
        if (head == del) {
            head = del.next;
        }
        if (del.next != null) {
            del.next.prev = del.prev;
        }
 
        if (del.prev != null) {
            del.prev.next = del.next;
        }
 
        return;
    }
  void displaynode() {
        Node currentnode = head;
        if (currentnode == null) {
            System.out.println("DLL is EMpty");
            return;
        }
        System.out.println("the elements os DLL are ");
        while (currentnode != null) {
            System.out.print(currentnode.data + " -> ");
            currentnode = currentnode.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DLL dlist = new DLL();
        String op = "y";
        int ch;
        while (op == "y") {
            System.out.println("\n1.Insert an element ");
            System.out.println("2.delte an elendement ");
            System.out.println("3.display elements");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("How do you want to insert an element ");
                    System.out.println("1.Insert at begining ");
                    System.out.println("2.Insert at a position ");
                    System.out.println("3.INsert at end ");
                    int ch2 = sc.nextInt();
                    switch (ch2) {
                        case 1:
                            System.out.println("enter the element");
                            int data = sc.nextInt();
                            dlist.InsertAtbeg(data);
                            System.out.println("element inserted ");
                            break;
                        
                        case 2:
                            System.out.println("enter the position at which the element is to be inserted ");
                            int position=sc.nextInt();
                            Node currentNode  =dlist.head;
                            int count=1;
                            while(count!=position)
                                {
                                    currentNode=currentNode.next;
                                    count+=1;
                                }
                            System.out.println("enter element to be inserted ");
                            int new_data=sc.nextInt();
                            dlist.InsertAfter(currentNode,new_data);
                            System.out.println("elemeent inserted ");
                            break;
                         
                        case 3:
                            System.out.println("enter element to be inserted ");
                            data=sc.nextInt();
                            dlist.InsertAtend(data);
                            break;
                        default:
                            System.exit(0);                   
                    }
                break;    
                case 2: 
                    System.out.println("enter the element to be deleted ");
                    int d_ele=sc.nextInt();
                    Node currentNode=dlist.head;
                    while(currentNode.data!=d_ele)
                        {
                            currentNode=currentNode.next;

                        } 
                    dlist.deleteNode(currentNode);
                break;
                    
                case 3:
                        dlist.displaynode();
                break;
                default :
                       System.out.println("Invalid option ");
                       System.exit(0);
                    break;   
            }
            System.out.println("Do u want to contiue ");
            op=sc.nextLine();
        }
        sc.close();
    }
}