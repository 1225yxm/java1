package apache组件;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections.iterators.UniqueFilterIterator;

public class Apache02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] string=new String[ ] {"java","c#","c++","css","css","c#","c++"};
		
		List<String> list=Arrays.asList(string);
		Iterator<String> iterator=list.iterator() ;
		Iterator<String> iterator1=new UniqueFilterIterator (iterator);
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}

}
