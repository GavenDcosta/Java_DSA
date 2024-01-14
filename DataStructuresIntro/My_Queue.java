package DataStructuresIntro;

public class My_Queue {
    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println(q.isEmpty());

        q.enqueue(69);
        q.enqueue(45);
        q.enqueue(2);

        System.out.println(q.isEmpty());

        q.show();

        System.out.println();

        q.dequeue();

        System.out.println();

        q.show();

        System.out.println();

        q.enqueue(9);
        q.enqueue(3);
        q.enqueue(23);
        q.enqueue(25);
        q.enqueue(33);
        q.enqueue(33);

        System.out.println("isFull : " + q.isFull());
        
        q.show();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        
        q.enqueue(3);
        q.enqueue(23);
        q.enqueue(25);
        q.enqueue(33);
        q.enqueue(33);

        System.out.println();

        q.show();

        System.out.println();

        System.out.println("Size : " + q.getSize());

        System.out.println("isFull : " + q.isFull());
    }

    public static class Queue{
       int queue[] = new int[5];
       int size;   
       int front;  // initially 0
       int rear;   // initially 0

       public void enqueue(int data){
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + data);
        }
       }

       public int dequeue(){
         int data = queue[front];
         front= (front + 1)%5;
         size--;

         return data;
       }

       public void show(){
        for(int i = 0; i<size; i++){
            System.out.print(queue[(front + i)%5] + " ");
        }

        for(int n : queue){
            System.out.print(n + " ");
        }
       }

       public int getSize(){
           return size;
       }

       public boolean isEmpty(){
            return size==0;
       }

       public boolean isFull(){
        return size==5;
       }
    }
}
