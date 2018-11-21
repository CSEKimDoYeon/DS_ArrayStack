package stack;

public class TestArrayStack {
	public static void main(String args[]){
		
		Stack st = new ArrayStack(1);
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st.pop());
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(9);
		st.push(10);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		}

}
