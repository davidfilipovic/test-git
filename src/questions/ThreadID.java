package questions;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadID {
	
	
	private static final AtomicInteger nextID = new AtomicInteger(0);
	
	private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>(){
		
		@Override
		protected Integer initialValue(){
			return nextID.getAndIncrement();
		}
	};

}
