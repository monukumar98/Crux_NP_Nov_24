package Lec34;

public class Abstract_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abstract_Demo ab = new Abstract_Demo();
	
//		Abstract_Demo ab = new Abstract_Demo_Chlid();
//		ab.Payment();
		Abstract_Demo ab = new Abstract_Demo() {
			@Override
			public void Payment() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Abstract_Demo ab1 = new Abstract_Demo() {
			@Override
			public void Payment() {
				// TODO Auto-generated method stub
				
			}
			
		};
		

	}

}
