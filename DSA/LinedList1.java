package DSA;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = next;
  }
}

public class LinedList1 {
  static Node head;

  public static void AddinFornt(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      head.next = newNode;

    }
  }

  public static void addInLast(int data) {
    if (head == null) {

      head = new Node(data);
      head.next = null;
    } else {

      Node newNode = head;
      while (newNode.next != null) {
        newNode = newNode.next;

      }

      newNode.next = head;
      head.next = null;
    }
  }

  public static void PrintNodes() {

    Node t = head;

    while (t != null) {

      System.out.println(t.data);
      t = t.next;
    }

  }

  public static void main(String[] args) {

    addInLast(10);
    addInLast(20);
    PrintNodes();

    System.out.println(Integer.toBinaryString(5 ^ 6));
    System.out.println(Integer.toBinaryString(3));

    System.out.println(Integer.toBinaryString(1 & 0));

    System.out.println(Integer.toBinaryString(1 | 1));
  }

}
