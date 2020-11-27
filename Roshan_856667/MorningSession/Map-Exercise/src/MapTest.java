import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Student aditya = new Student(1,"Aditya");
		Student nikitha = new Student(2,"Nikitha");
		Student keerthana = new Student(3,"Keerthana");
		Student arya = new Student(4,"Arya");
		
		List<Student> cs = new ArrayList<Student>();
		List<Student> ec = new ArrayList<Student>();
		
		cs.add(aditya);
		cs.add(nikitha);
		ec.add(keerthana);
		ec.add(arya);
		
		Map<String,List<Student>> map = new HashMap<String,List<Student>>();
		map.put("CS", cs);
		map.put("EC", ec);
		
//		for(Map.Entry<String,List<Student>> entry : map.entrySet()) {
//			System.out.println();
//		}
		
		System.out.println(map);
		
		
	}
}
