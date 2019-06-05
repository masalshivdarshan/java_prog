import java.util.*;
public class List_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("1");
		al.add("b");
		al.add("2");
		al.add("c");
		al.add("3");
		System.out.println(al);
		System.out.println(al.size());
		//traverse in list
		
		
		/*ListIterator itr=al.listIterator();
		System.out.println("forward List");
		while(itr.hasNext()){
			System.out.println(itr.next());}
		System.out.println("reverse List");
		while(itr.hasPrevious()){
		System.out.println(itr.previous());
		}*/
		 
			//method foreach loop
			//for(String str:al)
			
				//System.out.println(str);
				
			
			//for loop
			/*for(String s=0;s<at.size();s++){System.out.println(s);}*/
		
		//for each lamabada//
		
		/*al.forEach(str->
				{
			
			System.out.println(str);
			});*/
		
		//remove 
		//al.remove();
		//System.out.println(al);
		//remove all 
		//al.removeAll(al);
		//System.out.println(al);
	}

}
