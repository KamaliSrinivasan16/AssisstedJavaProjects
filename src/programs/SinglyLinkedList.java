package programs;

public class SinglyLinkedList 
{
	Node head;
	//inner class - node
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	// to insert a node
	public static SinglyLinkedList insert(SinglyLinkedList list,int data)
	{
		Node new_node = new Node(data);
		if(list.head==null)
		{
			list.head = new_node;
		}
		else
		{
			Node last = list.head;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	//to display the list
	public static void display(SinglyLinkedList list)
	{
		Node currentNode = list.head;
		System.out.println("SinglyLinkedList: ");
		while(currentNode.next!=null)
		{
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}
	
	//to delete the key from list
	public static SinglyLinkedList deleteByKey(SinglyLinkedList list,int key)
	{
		Node currentNode = list.head, prev = null;
		
		if(currentNode != null && currentNode.data == key)
		{
			list.head = currentNode.next;
			System.out.println("key "+key+" found and deleted\n");
			return list;
		}
		while(currentNode != null && currentNode.data !=key)
		{
			prev = currentNode;
			currentNode = currentNode.next;
		}
		if(currentNode != null)
		{
			prev.next = currentNode.next;
			System.out.println("key "+key+" found and deleted\n");
		}
		if(currentNode == null)
		{
			System.out.println("key "+key+" not found\n");
		}
		return list;
	}
	
	//main function
	public static void main(String[] args) 
	{
		SinglyLinkedList list = new SinglyLinkedList();
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,6);
		
		display(list);
		deleteByKey(list,3);
		display(list);

	}

}
