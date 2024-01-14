package DataStructuresIntro;

// import java.util.Stack;

public class My_Stack {
    public static void main(String[] args) { 
        //  Stack s = new Stack();

        Stack s = new Stack();

        System.out.println("Empty : " + s.isEmpty());
        
        s.push(69);
        s.push(7);

        s.show();

        s.pop();

        System.out.println();

        s.show();

        System.out.println();

        s.push(4);
        s.push(9);

        s.show();

        System.out.println();

        s.pop();

        s.show();

        System.out.println();

        
        System.out.println("Size : " + s.size());

        System.out.println();

        System.out.println("Empty : " + s.isEmpty());

        System.out.println();

        System.out.println("Peek : " + s.peek());
             
    }

    public static class Stack{

        int stack[] = new int[5];
        int top = 0;

        public void push(int data){
             stack[top] = data;
             top++;
        }

        public void pop(){
         stack[top] = 0;
         top--;
        }

        public void show(){
         for(int i = 0; i<top; i++){
             System.out.print(stack[i] + " ");
         }
       }

       public int size(){
        return top;
       }

       public int peek(){
        return stack[top-1];
       }

       public boolean isEmpty(){
         return top<=0;
       }
    }
}
