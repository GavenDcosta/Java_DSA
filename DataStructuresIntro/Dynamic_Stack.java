package DataStructuresIntro;

// import java.util.Stack;

public class Dynamic_Stack{
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
        int size = 2;
        int stack[] = new int[size];
        int top = 0;

        public void push(int data){
             if(size() == size)
                expand();
    
             stack[top] = data;
             top++;
        }

        public void pop(){
         if (!isEmpty()) {
             top--;
             stack[top] = 0;
         }
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

       private void expand(){
        int length = size();
        int newStack[] = new int[size * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        size *= 2;
       }
    }
}
