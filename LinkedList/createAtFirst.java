package LinkedList;

public class createAtFirst {
    
    //this creates nodes only not linked list we make linkedlist at below
    //this only creates the node with next null
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
            //created new node with data value an dnext= null
            Node newNode=new Node(data);
            size++;
    
            //if empty null
            if(head==null){
                head=tail=newNode;
                return;
            }
    
            //step newNode next=head
            newNode.next=head;
    
            //step 3
            head =newNode;
        }
    
    
        public  void addLast(int data){
            //created new node with data value an dnext= null
            Node newNode=new Node(data);
            size++;
    
            //if empty or null linkedlist
            if(head==null){
                head=tail=newNode;
            }
    
            //step newNode next=head
            tail.next=newNode;
    
            //step 3
            tail=newNode;
        }

        public void add(int idx,int data){
            if(idx ==0 ){
                addFirst(data);
                return;
            }

            Node newNode= new Node(data);//node banla 0
            size++;
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;

        }

        public int removeFirst(){
            if(size==0){
                System.out.println("Ll is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }

        public int removeLast(){
            if(size==0){
                System.out.println("Ll is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }

            Node prev=head;

            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }

            int val=prev.next.data; //tail.data
            prev.next=null;
            size--;
            tail=prev;
            return val;
        }

        public int itrSearch(int key){
            Node temp=head;
            int idx=0;
            while(temp!=null){
                if(temp.data==key){
                    return idx;
                }
                else{
                    temp=temp.next;
                    idx++;
                }
            }
            return -1;
        }
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data ==key){
                return 0;
            }
            int idx =helper(head.next,key);
            if(idx==-1){
                return-1;
            }
            return idx+1;
        }
        public int recursiveSearch(int key){
            return helper(head,key);
        }
    
        public void printLinkedlist(){
            //for empty linked list
            if(head==null){
                System.out.println("Linkedlist is empty");
                return;
            }
    
            // create a temp node of head 
            Node temp=head;
            
            while(temp!=null){
                System.out.print(temp.data+" ->> ");
                temp=temp.next;
            }
            System.out.println();
        }
        

        public static boolean isCycle(){
            //checks for loop is there or not
            Node slow= head;
            Node fast=head;
            while(fast!=null && fast.next !=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }

        public static void removeCycle(){
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            while(fast !=null && fast.next !=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast ==slow){
                    cycle=true;
                }
            }

            if(cycle==false){
                return;
            }

            slow=head;
        }


        public static void main(String[] args) {
            // createAtFirst l1=new createAtFirst();
            // l1.printLinkedlist();
            // l1.addFirst(2);
            // l1.printLinkedlist();
            // l1.addFirst(1);
            // l1.printLinkedlist();
            // l1.addLast(3);
            // l1.printLinkedlist();
            // l1.addLast(4);
            // l1.printLinkedlist();
            // l1.add(2, 9);
            // l1.printLinkedlist();
            // System.out.println("Size of linked list is: "+ l1.size);
            // l1.printLinkedlist();
            // System.out.println("removed value with data: "+ l1.removeFirst());
            // l1.printLinkedlist();
            // l1.removeLast();
            // l1.printLinkedlist();

            // System.out.println("key found at index = "+ l1.itrSearch(3));
            // System.out.println("key found at index = "+ l1.recursiveSearch(2));

            // createAtFirst l2=new createAtFirst();
            head = new Node(1);
            head.next=new Node(2);
            head.next.next=new Node(3);
            head.next.next.next=new Node(4);
            // head.next.next.next=head;
            System.out.println(isCycle());


    }
}
