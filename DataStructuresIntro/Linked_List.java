package DataStructuresIntro;

// import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        //   LinkedList  list = new LinkedList();

        MyLinkedList  list = new MyLinkedList();
        list.insert(4);
        list.insert(2);
        list.insert(69);
        list.insert(7);

        list.insertAtStart(5);

        list.insertInBetween(55, 2);
        list.insertInBetween(99, 0);
        list.insertInBetween(8, 0);

        list.show();

        list.delete(3);

        list.show();
        
    }

    public static class Node{
        int data;
        Node next;
    }

    public static class MyLinkedList{
        Node head;

        public void insert(int data){
            Node node = new Node();
            node.data = data;
            node.next = null;
            
            if(head == null){
                head = node;
            }else{
                Node n = head;
                while(n.next != null){
                    n = n.next;
                }

                n.next = node;
            }
        }

        public void show(){
            Node n = head;

            while(n.next != null){
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.println(n.data);
        }

        public void insertAtStart(int data){
            Node node = new Node();
            node.data = data;
            node.next = null;
            node.next = head;
            head = node;
        }

        public void insertInBetween(int data, int pos){
            Node node = new Node();
            node.data = data;
            node.next = null;   // null be default

            if(pos == 0){
                insertAtStart(data);
            }else{

               Node n = head;
   
               for(int i = 0; i < pos-1; i++){
                  n = n.next;
               }
   
               node.next = n.next;
               n.next = node;
            }
        }

        public void delete(int pos){
            Node n = head;
            for(int i = 0; i < pos - 1; i++){
                n = n.next;
            }

            n.next = n.next.next;
        }
    }

}


