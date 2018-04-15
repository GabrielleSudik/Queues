import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class Application {

	public static void main(String[] args) {
		
		//in programming lingo, the front of a queue is "head"
		//the back is the "tail"
		//it's FIFO (first in, first out)
		
		//like with a lot of things, you can look up "java queue"
		//to see a bunch of methods, implementing classes, etc.
		//we'll do an example with an implementing class
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);	
		//that 3 means max of three items.
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		//and we'll try to add a fourth to see what happens:
		//q1.add(40);
		//you get a runtime exception
		//you can add a try-catch block
		
		for(Integer value: q1){
			System.out.println("Queue value: :" + value);
		}
		
		Integer value2 = q1.remove();
		//that will remove the FIFO item
		
		System.out.println("Value removed is: " + value2);
		
		for(Integer value: q1){
			System.out.println("Queue value: :" + value);
		}
		
		//you can also just put the remove step into another block:
		System.out.println("Value removed is: " + q1.remove());
		//that will remove the NEXT FIFO item, and you didn't have to create a variable for it.
		
		for(Integer value: q1){
			System.out.println("Queue value: :" + value);
		}
		
		//you can keep going until the queue is empty.
		//try-catch blocks can also be used when removing.
		
		//here's the element method.
		//it identifies what's at the front.
		System.out.println("Head of queue is: " + q1.element());
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(3);	
		
		//let's try "offer" method.
		//this differs from add in that it ATTEMPTS to add items
		//if the queue is full, it won't.
		q2.offer(5);
		q2.offer(15);
		q2.offer(25);
		q2.offer(35);
		
		for(Integer value: q2){
			System.out.println("Queue2 value: :" + value);
		}
		//see how 35 didn't print? it's because it didn't get added.
		
		//poll is like remove, but also works only if it can.
		System.out.println("Queue2 poll: " + q2.poll());
		
		for(Integer value: q2){
			System.out.println("Queue2 value: :" + value);
		}
		
		//peek looks at the head of queue, if something is there.
		System.out.println("Head of queue is: " + q2.peek());

		//instead of an error message if nothing is at the head
		//you'll get a null
		System.out.println("Queue2 poll: " + q2.poll());
		System.out.println("Queue2 poll: " + q2.poll());
		System.out.println("Head of queue is: " + q2.peek());

		//queues are useful for when things are simultaneously being removed
		//from the head and added to the tail
		//depending on how you use them, they can "wait"
		//until space is available to add new items, etc.
	}

}
