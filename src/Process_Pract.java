
public class Process_Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		System.out.println("no of process:"+r.availableProcessors());
		System.out.println("avilable memory:"+r.freeMemory());
		System.out.println("free memory:"+r.freeMemory());
		System.out.println("Toatl Mmory"+r.totalMemory());
		System.out.println("Memory occupied: "+
		         (r.totalMemory()-r.freeMemory()));
		 for(int i=0;i<=10000;i++){
	         new Object();
	      }

	      r.gc();

	      System.out.println("::Memory status::");
	      System.out.println("Total memory: "+r.totalMemory());
	      System.out.println("Free memory: "+r.freeMemory());
	      System.out.println("Memory occupied: "+
	         (r.totalMemory()-r.freeMemory()));

	}

}
