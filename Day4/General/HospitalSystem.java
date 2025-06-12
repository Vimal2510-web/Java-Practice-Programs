package General;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [ age=" + age + "]";
	}		
}

class Patient extends Person {
	
	private String illness;
	
	Patient(String name,int age,String illness){
		super(name,age);
		this.illness=illness;
	}
	
	public String getillness() {
		return illness;
	}
	
	public String toString() {
		return "Patient [ - illness "+illness+"]";
	}
	
}

class Doctor extends Person{
	
	String specialization;
	
	Doctor(String name, int age, String specialization){
		super(name,age);
		this.specialization = specialization;
	}
	
	public String getSpecialization() {
		return specialization;
	}

	@Override
	public String toString() {
		return "Doctor [specialization = " + specialization + "]";
	}
	
}

class Appointment {
	
	private Patient patient;
	private Doctor doctor;
	private LocalDate appointmentDate;
	public Appointment(Patient patient, Doctor doctor, LocalDate appointmentDate) {
		super();
		this.patient = patient;
		this.doctor = doctor;
		this.appointmentDate = appointmentDate;
	}
	@Override
	public String toString() {
		return "Appointment :" + patient + "with" + doctor + "on" + appointmentDate ;
	}
		
}
public class HospitalSystem {
	
	public static void main(String[] args) {
		
	
	// Collections to store patients ,doctors and appointments
	
	List<Doctor> doctors = new ArrayList<>();
	List<Patient> patients = new ArrayList<>();
	List<Appointment> appointments = new ArrayList<>();
	
	LocalDate date = new LocalDate.now();
	
	// to add sample doctors
	
	doctors.add(new Doctor("Dr. Smith", 45, "Cardiology"));
	doctors.add(new Doctor("Dr.Strange",34,"Orthology"));
	doctors.add(new Doctor("Dr.Devil",32,"Neurology"));
	
	patients.add(new Patient("Aravind",24,"Heat Problem"));
	patients.add(new Patient("Palani",25,"Fracture"));
	patients.add(new Patient("Giri",25,"Migraine"));
	
	appointments.add(new Appointment(patients.get(0),doctors.get(0),new LocalDate.now()));
	appointments.add(new Appointment(patients.get(1), doctors.get(1), new LocalDate.now()));
	appointments.add(new Appointment(patients.get(2),doctors.get(2), new LocalDate.now()));
	
	// Display all appointments
	
	System.out.println("All appointments");
	appointments.forEach(System.out::println);
	
	// Using java 8 to filter the doctors based on doctors specialization
	
	String specializationToFilter ="Cardiology";
	List<Doctor> cardiologists = doctors.stream()
			.filter(doc -> doc.getSpecialization().equalsIgnoreCase(specializationToFilter))
			.collect(Collectors.toList());
	
	System.out.println("\n Doctors Specialised in : " + specializationToFilter);
	cardiologists.forEach(System.out::println);
	
	}
}
