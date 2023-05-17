package tree;

import java.util.Scanner;

public class Demo{
   public class TreeNode {

      int data;
      TreeNode left;
      TreeNode right;

      TreeNode(int data){
         this.data=data;
         this.left = this.right = null;

      }

   }

   TreeNode root;
   Demo(){
      root = null;
   }
//Tree creation

   public TreeNode insert(TreeNode root, int dataToBeInserted){
      if(root ==null){
         root = new TreeNode(dataToBeInserted);
         return root;
      }
      if(root.data > dataToBeInserted){
         root.left = insert(root.left, dataToBeInserted);
      }

      else if(root.data < dataToBeInserted){
         root.right = insert(root.right, dataToBeInserted);
      }
      return root;
   }

   public TreeNode search(TreeNode root, int dataToBeSearched){
      if(root == null || root.data == dataToBeSearched){
         return root;
      }
      if(root.data > dataToBeSearched){
         return search(root.left, dataToBeSearched);
      }
      //else
      return search(root.right, dataToBeSearched);

   }


   public void inOrder(TreeNode root){
      if(root ==null){
         return;
      }
      inOrder(root.left);
      System.out.println(root.data + "");
      inOrder(root.right);

   }

   public void preOrder(TreeNode root){
      if(root ==null){
         return;
      }
      System.out.println(root.data + "");
      inOrder(root.left);
      inOrder(root.right);

   }


   public void postOrder(TreeNode root){
      if(root ==null){
         return;
      }
      inOrder(root.left);
      inOrder(root.right);
      System.out.println(root.data + "");

   }


   public void insertIntoTree(int dataToBeInserted){
      root = insert(root, dataToBeInserted);
   }

   public TreeNode searchTree(int dataToBeSearched){
      return search(root, dataToBeSearched);
   }

   public void inOrderTraversal(){
      inOrder(root);
   }
   public void preOrderTraversal(){
      preOrder(root);
   }

   public void postOrderTraversal(){
      postOrder(root);
   }




   public static void main(String[] args){
      Demo binarySearchTree = new Demo();
      int n,num;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter how many numbers to be input");
      n = scan.nextInt();
      System.out.println("Enter " + n + " numbers : ");
      for (int i=0;i<n;i++){
         num = scan.nextInt();
         binarySearchTree.insertIntoTree(num);
      }
      System.out.println("Tree insertion done");

      System.out.println("Enter number to be searched");
      n = scan.nextInt();
      if (binarySearchTree.searchTree(n) != null){
         System.out.println("Number found");
      }else{
         System.out.println("Number not found");
      }
      System.out.println("Inorder traversal of binary search tree");
      binarySearchTree.inOrderTraversal();

      System.out.println("\npreOrder traversal of binary search tree");
      binarySearchTree.preOrderTraversal();

      System.out.println("\npostOrder traversal of binary search tree");
      binarySearchTree.postOrderTraversal();



   }




}








