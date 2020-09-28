package JavadataStructure;

public class Stack {
	
	int maxsize;
	long[] stackArray;
	int top;
	public Stack(int size) {
		this.maxsize=size;
		this.stackArray=new long[maxsize];
		this.top=-1;
		
	}
	public void push(int insert) {
		top++;
		stackArray[top]=insert;
		
	}
    public long pop() {
    	int old_top=top;
    	top--;
		return stackArray[old_top];
    	
    }
    public boolean isempty() {
    	return(top==-1);
    }
    public long peek() {
    	return stackArray[top];
    }
    public boolean isFull() {
    	return(maxsize-1==top);
    }
	public static void main(String[] args) {
		
		Stack stack=new Stack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		while(!stack.isempty()) {
			long popData=stack.pop();
			System.out.println(popData);
			
		}
	}

}
