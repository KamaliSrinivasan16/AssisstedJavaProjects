package programs;

public class doublyLinkedList 
{
    Node head;
    //inner class - node
    class Node
    {
    	int data;
    	Node prev;
    	Node next;
    	Node(int d)
    	{
    		data = d;
    	}
    }
    
    //to push an element at the beginning
    public void push(int data)
    {
    	Node new_node = new Node(data);
    	new_node.next = head;
    	new_node.prev = null;
    	if(head!= null)
    	{
    		head.prev = new_node;
    	}
    	head = new_node;
    }
    
    //to insert an element after the given index
    public void insertAfter(Node prev_node,int data)
    {
    	if(prev_node == null)
    	{
    		System.out.println("Previous node can't be NULL");
    		return;
    	}
    	Node new_node = new Node(data);
    	new_node.next = prev_node.next;
    	new_node.prev = prev_node;
    	prev_node.next = new_node;
    	if(new_node.next != null)
    	{
    		new_node.next.prev = new_node;
    	}
    			
    }
    
    //to insert an element before the given index
    public void insertBefore(Node next_node,int data)
    {
    	if(next_node == null)
    	{
    		System.out.println("Next node can't be NULL");
    		return;
    	}
    	Node new_node = new Node(data);
    	new_node.prev = next_node.prev;
    	new_node.next = next_node;
    	next_node.prev = new_node;
    	if(new_node.prev != null)
    	{
    		new_node.prev.next = new_node;
    	}
    	else
    	{
    		head = new_node;
    	}
    }
    
    //to append an element at end
    public void append(int data)
    {
    	Node new_node = new Node(data);
    	new_node.next = null;
    	Node last = head;
    	if(head == null)
    	{
    		new_node.prev = null;
    		head = new_node;
    		return;
    	}
    	while(last.next!=null)
    	{
    		last = last.next;
    	}
    	last.next = new_node;
    	new_node.prev = last;
    }
    
    //to display the elements
    public void display(Node node)
    {
    	Node last = null;
    	System.out.println("Traversal in forward direction: ");
    	while(node!=null)
    	{
    		System.out.print(node.data+" ");
    		last = node;
    		node = node.next;
    	}
    	
    	System.out.println("\nTraversal in reverse direction: ");
    	while(last!=null)
    	{
    		System.out.print(last.data+" ");
    		node = last;
    		last = last.prev;

    	}

    }
    
    //main function
	public static void main(String[] args) 
	{
		doublyLinkedList list = new doublyLinkedList();
		list.append(5);
		list.push(3);
		list.insertAfter(list.head,4);
		list.insertBefore(list.head,2);
		list.push(1);
		list.display(list.head);

	}

}
