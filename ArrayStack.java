package stack;

public class ArrayStack implements Stack{
 private Object[] a;
 private int size;
 
 public ArrayStack(int capacity){ // ¹è¿­°´Ã¼ a
	 a = new Object[capacity];
 }
 
 public boolean isEmpty(){
	 return (size==0);
 }
 
 public Object peek(){ // 0 1 2 3 4, size 5
	 if (size==0)
		 System.out.println("stack is empty");
	 return a[size-1];
 }
 
 public Object pop() {
	 if(size ==0) 
		 return "stack is empty";
	 else{
	 Object object = a[--size];
	 a[size] = null;
	 return "POP: "+object;
	 }
 }
 
 public void push(Object object){
	 if (size == a.length) 
		 resize();
	 a[size++] = object;
	 System.out.println("PUSH: "+object);
 }
 

 public void resize(){
	 Object[] aa = a;
	 a = new Object[2*aa.length];
	 System.arraycopy(aa, 0, a, 0, size);
 }
 
 public int size(){
	 return size;
 }
}
