package DataStructures;

public class GenericNode<T> {
	public T data;
	public GenericNode<T> next;

	public GenericNode(T data) {
		this.data = data;
		this.next = null;
	}

}
