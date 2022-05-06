package threadingAndMultiThreading;
public class Threading {
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Kalyan");
		System.out.println(t);
		System.out.println(t.getId());
		System.out.println(t.getName());
		t.setPriority(9);
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		System.out.println(t.getClass());
		System.out.println(t.getContextClassLoader());
		System.out.println(t.getStackTrace());
		System.out.println(t.getThreadGroup());
		System.out.println(t.getUncaughtExceptionHandler());
		System.out.println(Thread.getAllStackTraces());
		System.out.println(t.isAlive());
		System.out.println(t.isDaemon());
		System.out.println(Thread.activeCount());
////		t.wait();
//		System.out.println(t);
	}
}
