package BT_FC2;
import java.util.Scanner;

class Node{
	int data;
	Node next; 
	Node(int x){data = x; next=null;}
	Node(int x, Node t){data=x; next=t;}
	public String toString() {
		return data + "-->";
	}
	
}
  public class MySLL {
	Node head;
	MySLL(){head=null;}
	
	void add() {
		int n; 
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap n"); n = kb.nextInt();
		head = new Node(n,head);
	}
	void in() {
		System.out.print("\nNoi dung danh sach:\n ===>");
		Node p = head; 
		while(p!=null) {System.out.print(p); p=p.next;}
		System.out.print("null\n");
	}
	void taods() {
		int x;
		Node cuoi = null; head = null;
		Scanner kb = new Scanner(System.in);{ 
			while(true) {
				System.out.println("\n Nhap so x de them vao danh sach:");
				x=kb.nextInt();
				if(x==0) break;
				Node t = new Node(x);
				if(head==null)head=cuoi=t; else {cuoi.next=t; cuoi=t;}
			}
		}
	}
	int demds() {
		int dem=0;
		Node p = head;
		while(p!=null) {
			dem++;
			p=p.next;
		}
		return dem;
	}
	int tong() {
		int k=0;
		Node p=head;
		while(p!=null) {k=k+p.data; p=p.next;}
		return k;
	}
	int demle() {
		int k=0;
		Node p=head;
		while(p!=null) {if(p.data%2!=0) k++; p=p.next;}
		return k;
	}
	int max() {
		int k;
		if(head==null)k=0; else k=head.data;
		Node p=head;
		while(p!=null) {if(k<p.data) k=p.data;p=p.next;}
		return k;
	}
	public void main(String[] args) {
		MySLL l = new MySLL();
		l.add();
		l.taods();
		l.demds();
		l.in();
	}
}