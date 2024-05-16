
//  Q.1 Write recursive function to add node into bst.

package com.sunbeam;

import com.sunbeam.BSTree.Node;

public class Recursive 
{
	static class node
	{	
	private int data;
	private node left;
	private node right;
	
	public node(int value)
	{
		data=value;
		left=right=null;
	}
	}
	
	private node root;
	
	public Recursive()
	{
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void insert(int value)
	{
		root=addnode(root,value);
	}
	public node addnode(node root,int value)
	{
		node newnode = new node(value);
		
		if(isEmpty())
		{
			root = newnode;
		}
		
		if(value<root.data)
		{
			root.left=addnode(root.left,value);
		}
		else if(value>root.data)
		{
			root.right=addnode(root.right,value);
		}
		return root;
	}
	
	public void inorder()
	{
		System.out.print(" In-Order :");
		inorder(root);
		System.out.println(" ");
		
	}
	public void inorder(node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		
		System.out.println(" "+root.data);
		
		inorder(root.right);
	}
}
