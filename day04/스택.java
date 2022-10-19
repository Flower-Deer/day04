package day04;

public class ���� {

	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		//�����ϱ�
		s.push('A');
		s.push('B');
		s.push('C');
		s.push('D');
		s.push('E');
		
		System.out.println( (char) s.pop()); //������ 
		System.out.println( (char) s.pop()); 
		System.out.println( (char) s.pop()); 
		System.out.println( (char) s.pop()); 
		System.out.println( (char) s.pop()); 
		
		Stack<Integer> s1 = new Stack<Integer>();
		//�����ϱ�
		s1.push(3331);
		s1.push(8888);
		s1.push(7777);
		s1.push(9999);
		s1.push(0000);
		
		System.out.println( (Integer) s1.pop()); //������ 
		System.out.println( (Integer) s1.pop());
		System.out.println( (Integer) s1.pop());
		s1.push(9999);
		s1.push(0000);
		
	}

}
class Stack<T> {
	private T stack[] ;
	private int top;//�迭�� �ε����� ������ �ֻ����� ������ �ش�. 
	
	//������ �⺻�����ڷ� �����ϸ� 10���� ���ð����� Ȯ��
	@SuppressWarnings("unchecked")
	public Stack() {
		stack = (T[]) new Object[10];
		top = -1;//������ ��� �ִ� ��Ȳ 
	}
	//������ ũ�⸦ ������ ũ��� ����� �ּ� ũ��� 10���� �Ѵ�
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		if(size<10) size=10;
		stack = (T[]) new Object[size];
		top = -1;//������ ��� �ִ� ��Ȳ 
	}
	public void push(T a) {
		//������ ������ �����ִ� Ȯ���ϱ� 
		if( isFull() ) {
			System.out.println(" Stack OverFlower ");
			return;
		}
		top++; // System.out.println(top+"~~");
		stack[top]=a; // System.out.println(stack[top]+"~~~");
	}
	private boolean isFull() {
		if( top == stack.length - 1) return true;
		else return false;
	}
    
	public T pop() {
		if( isEmpty() ) {
			System.out.println("Stack UnderFlower ");
			return null;
		}
		
		T temp = stack[top];
		top--;
		return temp;
	}
	
	private boolean isEmpty() {
		if( top == -1) return true;
		else return false;
	}
	
}








