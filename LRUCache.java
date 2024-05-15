import java.util.Scanner;
import java.util.HashMap;

 class Node {
    int data;
    Node prev;
    Node next;
    
   
    Node(int x){
        data = x;
    }

}


public class LRUCache {
    int capacity;
    int count;
    HashMap<Integer,Node> hm ;
   static Node head;
   static Node tail;
   static Scanner sc = new Scanner(System.in);

LRUCache(int cap){
     capacity = cap;
     hm = new HashMap<>();
     count = 0;
     head = new Node(0);
     tail = new Node(0);
     head.prev = null;
     tail.next = null;
     head.next = tail;
}



public  void add(int key){
   if(hm.containsKey(key)){
    System.out.println(" \n CACHE HIT : ");
    
     Node ptr = hm.get(key);
     if(ptr!=null) {
    System.out.println("\nDesired value is : " + ptr.data );
    ptr.prev.next = ptr.next;
     ptr.next.prev = ptr.prev;
    ptr.prev = head;  
   ptr.next = head.next;
   head.next.prev = ptr;
    head.next = ptr;
     } 
     else {
        System.out.println("Retrived node is null ");
     }
   } 
else {
    System.out.println(" \nCACHE MISS : ");
    System.out.println(" \nEnter the value to be stored: ");
    int val = sc.nextInt();
    Node nn = new Node(val);
 
    if(count<capacity){
        nn.next = head.next;
        head.next.prev = nn;
        head.next = nn;
        nn.prev = head;
        hm.put(key,nn);
        System.out.println("\nSuccessfully added " + nn.data);
        count++;
    }
    else {
      Node pre = tail.prev;
      pre.prev.next = pre.next;
      pre.next.prev = pre.prev;
      nn.next = head.next;
      head.next.prev = nn;
      head.next = nn;
      nn.prev = head;
      hm.remove(pre.data);
      hm.put(key,nn);
     System.out.println("\nCache is full,least recently are remove and recent item  added successfully " + nn.data);
      
    }

}






}

public static void display(){
    Node ptr=head.next;
    System.out.println(" LRU Cache Contents: ");
    while(ptr!=tail){
        System.out.println(ptr.data + " ");
        ptr = ptr.next;
    }
    System.out.println();
}




public static void main(String args[]){
 
    System.out.println("Enter the cache capacity : ");
    int cap = sc.nextInt();
     LRUCache lc = new LRUCache(cap);
     System.out.println();
     while(true) {
        System.out.println("--------------------------------------------");
     System.out.println("Enter the choice: ");
      System.out.println("1.Get from the cache\n2.Display ");
      System.out.println("--------------------------------------------");

     int ch = sc.nextInt();
      if(ch==1){
         System.out.println("Enter the data to be searched(key)");
         int key = sc.nextInt();
         lc.add(key);
         continue;
      }
      else if(ch==2){
             display();
      }
      else {
        break;
      }

     }
}


}
