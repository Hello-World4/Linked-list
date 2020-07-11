import java.util.Stack;

public class Link {

    Node head;

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

    public void addFirst(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void addLast(int data){
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        Node new_node = new Node(data);
        curr.next = new_node;
    }

    public boolean isHere( int elem){
        if(head.data == elem){
            return true;
        }
        Node curr = head;
        while(curr != null && curr.data != elem){
            curr = curr.next;
            if(curr.data == elem){
                return true;
            }
        }
        return false;
    }

    public int total(){
        int count = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            count++;
        }
        return count;
    }

    public void reverse(){
        Stack<Integer> i = new Stack<Integer>();
        Node curr = head;
        while(curr != null){
            i.push(curr.data);
            curr = curr.next;
        }
        while(!i.isEmpty()){
            System.out.println(i.pop());
        }
    }

    public void delete(int position){
        int count = 0;
        Node curr = head;
        while( count < position-1){
            curr = curr.next;
            count++;
        }
        Node tmp = curr.next;
        curr.next = tmp.next;
        tmp.next = null;


    }







}
