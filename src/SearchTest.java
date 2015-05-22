import java.util.ArrayList;
import java.util.List;


public class SearchTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Holme");
		list.add("Skåde");
		list.add("Viby");
		list.add("Beder");
		list.add("Stautrup");
		list.add("Engdal");
		list.add("Forældreskolen");
		list.add("Malling");
		
		
		SearchableList<String> schools = new SearchableList<String>(list);
		
		System.out.println(schools.search("Malling"));
		System.out.println(schools.search("Beder"));
		System.out.println(schools.search("Riskov"));

	}

}
