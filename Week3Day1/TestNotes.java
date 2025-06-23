package Week3Day1;


// Converts a List of objects into a Map by considering duplicated keys and store them in sorted order
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Notes{
	
	private int Id;
	private String tagName;
	private int tagId;
	
	
	
	public Notes(int id, String tagName, int tagId) {
		super();
		Id = id;
		this.tagName = tagName;
		this.tagId = tagId;
	}

	public int getId() {
		return Id;
	}
	
	public String getTagName() {
		return tagName;
	}
	
	public int getTagId() {
		return tagId;
	}
	
	
	
	
	
}
public class TestNotes {
	
	public static void main(String[] args) {
		
		List<Notes> notesList = new ArrayList<>();
		
		notesList.add(new Notes(1,"note1",11));
		notesList.add(new Notes(2,"note2",22));
		notesList.add(new Notes(3,"note3",33));
		notesList.add(new Notes(4,"note4",44));
		notesList.add(new Notes(5,"note5",55));
		notesList.add(new Notes(6,"note6",66));
		
		Map<String, Integer> notesRecords = notesList.stream()
										.sorted(Comparator.comparingInt(Notes::getTagId)
										.reversed())
										.collect(Collectors.toMap(Notes::getTagName, Notes::getTagId
												,(oldValue,newValue) -> oldValue,LinkedHashMap:: new));
		
		System.out.println("Notes : " + notesRecords);
		
	}

}
