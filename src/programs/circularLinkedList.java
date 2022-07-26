package programs;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
	
}

public class circularLinkedList 
{
	Node head;
	
	circularLinkedList()
	{
		head = null;
	}
	
	//to sort and insert the elements
	public void sortedList(Node new_node)
	{
		Node current = head;
		if(current == null)
		{
			new_node.next = new_node;
			head = new_node;
		}
		else if(current.data >= new_node.data)
		{
			while(current.next != head)
			{
				current = current.next;
			}
			current.next = new_node;
			new_node.next = head;
			head = new_node;
		}
		else
		{
			while(current.next != head && current.next.data < new_node.data)
			{
				current = current.next;
			}
			new_node.next = current.next;
			current.next = new_node;
		}
	}

	//to display elements
	public void display()
	{
		if(head!=null)
		{
			System.out.println("CircularLinkedList : \n");
			Node temp = head;
			do
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}while(temp!= head);
		}
	}
	
	//main function
	public static void main(String[] args) 
	{
		circularLinkedList list = new circularLinkedList();
		int[] arr = new int[] {6,2,8,3,5,1};
		Node temp = null;
		for(int i=0;i<6;i++)
		{
			temp = new Node(arr[i]);
			list.sortedList(temp);
		}
		
		list.display();

	}

}
