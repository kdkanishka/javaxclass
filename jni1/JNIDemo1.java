/**
 *Author : Kanishka Dilshan
 *Blog   : http://javaxclass.blogspot.com
 *Purpose: Demonstrating a very simple JNI example
 */
public class JNIDemo1 {

	static {
	    System.loadLibrary("nativeops"); // will load libhello.so
	}

	public static void main(String args[]){
		try{
			//System.loadLibrary("nativeops");
			NativeOps nativeOperaions = new NativeOps();
			
			for(int i=0;i<20;i++){
				long result = nativeOperaions.factorial(i);
				System.out.println("Factorial of "+ i + " is " + result);
			}
			
		}catch(UnsatisfiedLinkError e){
			System.out.println("Could not load native code! "+e.getMessage());
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Unknown error! "+e.getMessage());
		}
	}
}
