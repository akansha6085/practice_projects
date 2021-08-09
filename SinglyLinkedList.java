public class SinglyLinkedList{
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	//function for display 
	public void display(){
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	//insert node at start of Singly linked list
	public void insertfirst(int value) {
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	//insert node at end of Singly linked list
	public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current=head;
		while(null!=current.next){
		current=current.next;
	}
        current.next=newNode;
	}	
	
	//insert a node at a given position in SLL
	public void insert(int position,int value) {
		//1->4->5
		//1->6->4->5
		ListNode node=new ListNode(value);
		if(position==1) {
			node.next=head;
			head=node;
		}
		else {
			ListNode previous=head;
			int count=1; //position-1
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=node;
			node.next=current;
		}
	}
	
	//To calculate length of SLL
	public int length() {
		if(head==null) {
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current!=null){
			count++;
			current=current.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		//for inserting at first
		sll.insertfirst(11);
		sll.insertfirst(12);
		sll.insertfirst(1);
		
		//for inserting at last
		sll.insertLast(3);
		sll.insertLast(5);
		sll.insertLast(7);
		
		//for position insert
		sll.insert(1,3);
		sll.insert(2,6);
		
		//for displaying 
		sll.display();
		
		//for counting the length
		System.out.println("Length is - "+ sll.length());
	}
}
