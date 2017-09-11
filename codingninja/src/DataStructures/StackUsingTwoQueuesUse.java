package DataStructures;

public class StackUsingTwoQueuesUse {
	public static void main(String[] args) {
		StackUsingTwoQueues<Integer> stack1=new StackUsingTwoQueues<Integer>();
		stack1.pop();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		stack1.push(50);
		stack1.push(60);
		stack1.push(70);
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.top());
		System.out.println(stack1.top());
		System.out.println(stack1.size());
		System.out.println(stack1.isEmpty());
	}
}