package DataStructuresIntro;

public class Binary_Search_Tree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(69);
        tree.insert(4);
        tree.insert(41);
        tree.insert(24);
        tree.insert(54);
        tree.insert(2);
        tree.insert(1);

        tree.inOrder();
        
        System.out.println();

        tree.preOrder();

        System.out.println();

        tree.postOrder();
        
    }

    public static class Node{
       int data;
       Node left;
       Node right;

       public Node(int data){
        this.data = data;
       }
    }

    public static class BinaryTree{
       Node root;

       public void insert(int data){
        root = insertRec(root, data);
          
       }

       public Node insertRec(Node root, int data){
            if(root == null){
                root = new Node(data);
            }else if(data < root.data){
               root.left = insertRec(root.left, data);
            }else if(data > root.data){
                root.right = insertRec(root.right, data);
            }

            return root;
       }

       public void inOrder(){
           inOrderRec(root);
       }

       public void inOrderRec(Node root){
          if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
          }
       }

       public void preOrder(){
        preOrderRec(root);
       }
   
       public void preOrderRec(Node root){
          if(root!=null){
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
          }
       }

       public void postOrder(){
        postOrderRec(root);
       }
   
       public void postOrderRec(Node root){
          if(root!=null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
          }
       }

    }
}
