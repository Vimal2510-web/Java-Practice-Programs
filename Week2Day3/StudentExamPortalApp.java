package Week2Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Exam{
	
	private final List<Character> answerKey;

	public Exam(List<Character> answerKey) {
		this.answerKey = answerKey;
	}
	
	public int calculateScore(List<Character> studentAnswers) {
		
		return (int) IntStream.range(0,Math.min(answerKey.size(),studentAnswers.size()))
				.filter(i -> answerKey.get(i).equals(studentAnswers.get(i)))
				.count();
	}
	
	public int getTotalQuestions() {
		return answerKey.size();
	}
}

class Student{
	
	private final String name;
	private final List<Character> answers;
	public Student(String name, List<Character> answers) {
		this.name = name;
		this.answers = answers;
	}
	
	public String getName() {
		return name;
	}
	public List<Character> getAnswers() {
		return answers;
	}
	
}

class GradingPortal{
	
	private final Exam exam;
	private final List<Student> students;
	
	public GradingPortal(Exam exam) {
		this.exam = exam;
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void gradeStudents() {
		System.out.println("Student Exam Results ");
		
		
		for(Student student : students) {
			int score = exam.calculateScore(student.getAnswers());
			boolean passed = score >= exam.getTotalQuestions() * 0.6;
			
			System.out.println(student.getName() + " Score " + score + "/ " + exam.getTotalQuestions()+
					"[ " +( passed ? "Pass" : " Fail") + "]");
		}
	}
}
public class StudentExamPortalApp {

	public static void main(String[] args) {
		
		List<Character> answerKey = Arrays.asList('A', 'B' ,'C' , 'D' ,'A');
		
		Exam exam = new Exam(answerKey);
		
		GradingPortal portal = new GradingPortal(exam);
		
		portal.addStudent(new Student("Vimal", Arrays.asList('A', 'B' ,'C' ,'B' ,'A')));
		portal.addStudent(new Student("Negan", Arrays.asList('B', 'A' ,'C' , 'D', 'A')));
		portal.addStudent(new Student("Rajesh", Arrays.asList('B', 'B' ,'C' , 'B' , 'A')));
		portal.addStudent(new Student("Ranjith", Arrays.asList('B', 'A' ,'C' , 'C' , 'A')));
		
		portal.gradeStudents();
	}
}
