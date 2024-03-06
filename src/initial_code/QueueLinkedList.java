package initial_code;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		
		//TO ENQUEUE
		queue.offer("mango");
		queue.offer("apple");
		queue.offer("kiwi");
		queue.offer("sitafal");
		System.out.println(queue);
		queue.peek();
		System.out.println(queue);
		
		// to DEQUEUE
		queue.poll();
		System.out.println(queue);
	}

}
