import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class People {
	private List<Person> persons = new ArrayList<Person>();
	public List<Person> getMaleList(Predicate<Person> predicate){
		return persons;
		
	}
}
