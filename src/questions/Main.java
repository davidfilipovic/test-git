package questions;

public class Main {

	
	public void forEachNumber(Callback<? super Number> call){
		
		Integer u = new Integer(3);
		call.print(u);
		
	}
	
	
	public static void main(String[] args) {

		Callback<Integer> c = new Callback<>();
		
		Main m = new Main();
		
		
		m.forEachNumber(new Callback<Object>(){
//			@Override
			protected void print(Object val){
				System.out.println("here print in :" + val);
			}
			
		});
		
	}

}
