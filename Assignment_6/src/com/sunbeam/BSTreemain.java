package com.sunbeam;

public class BSTreemain 
{

	public static void main(String[] args)
	{
Recursive tree = new Recursive();
		
		tree.insert(8);
		tree.insert(3);
		tree.insert(10);
		tree.insert(6);
		tree.insert(1);
//		tree.addNode(14);
//		tree.addNode(13);
//		tree.addNode(7);
//		tree.addNode(4);
		
		//tree.preOrder();
		//tree.inOrder();
		//tree.postOrder();
		
		/*
		BSTree.Node ret =  tree.binarySearch(15);
		if(ret == null)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found");
		*/
		
		tree.inorder();
//		tree.deleteNode(10);
//		tree.inOrder();
//		

	}

}
