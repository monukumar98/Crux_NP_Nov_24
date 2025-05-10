package Lec34;

public class StackI_Client {
	public static void main(String[] args) {
		StackI st = new StackI_Class();
		StackI st1 = new StackI() {

			@Override
			public void push(int item) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int pop() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int peek() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}

}
