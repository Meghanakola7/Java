
import java.util.HashMap;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> m=new HashMap<Integer,String>();
		m.put(1000,"Stewy");
		m.put(700,"Lois");
		m.put(1000,"Meg");
		m.put(200,"Peter");
		System.out.println(m);
		m.put(900,"Brian");
		m.put(500,"Lois");
		System.out.println(m);
		Set keys=m.keySet();
		System.out.println(keys);
		Iterator it=keys.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		Collection val=m.values();
		System.out.println(val);
		Iterator it2=val.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		Set ent=m.entrySet();
		System.out.println(ent);
		Iterator it3=ent.iterator();
		while(it3.hasNext())
		{
			Map.Entry m1=(Map.Entry)it3.next();
		    System.out.println(m1.getKey()+ " "+m1.getValue());
		}
	}

}
