package Week2Day2;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Cab{
	
	private final String driverName;
	private final double rating;
	private boolean available;
	private final String location;
	public Cab(String driverName, double rating, String location) {
		super();
		this.driverName = driverName;
		this.rating = rating;
		this.available = true;
		this.location = location;
	}
	
	public String getDriverName(){
		return driverName;
	}
	
	public double getRating() {
		return rating;
	}
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Cab [driverName=" + driverName + ", rating=" + rating + ", available=" + available + ", location="
				+ location + "]";
	}
		
}

class BookingRequest{
	
	private final String userLocation;
	private final LocalDateTime requestTime;
	
	public BookingRequest(String userLocation) {
		super();
		this.userLocation = userLocation;
		this.requestTime = LocalDateTime.now();
	}
	public String getUserLocation() {
		return userLocation;
	}
	public LocalDateTime getRequestTime() {
		return requestTime;
	}
}

class Dispatcher{
	
	private final List<Cab> cabList;

	public Dispatcher(List<Cab> cabList) {
		super();
		this.cabList = cabList;
	}
	
	public Optional<Cab> dispatchCab(BookingRequest request){
		
		List<Cab> filtered = cabList.stream()
				.filter(cab -> cab.isAvailable() && cab.getLocation().equalsIgnoreCase(request.getUserLocation()))
				.sorted(Comparator.comparingDouble(Cab :: getRating).reversed())
				.collect(Collectors.toList());
		
		if(!filtered.isEmpty()) {
			Cab assigned = filtered.get(0);
			assigned.setAvailable(false);
			return Optional.of(assigned);
		}else {
			return Optional.empty();
		}
	}
	
	public void showCabs() {
		cabList.forEach(System.out::println);
	}
	
}
public class CabBookingDispatcher {
	
	public static void main(String[] args) {
		
		List<Cab> cabs = Arrays.asList(
				new Cab("Vimal" , 4.1,"Bangalore"),
				new Cab("Rajesh", 4.5,"Bangalore"),
				new Cab("Karthick", 4.3,"Mangalore"),
				new Cab("Rasool",4.2,"Bangalore"));
		
		Dispatcher dispatcher = new Dispatcher(cabs);
		dispatcher.showCabs();
		
		System.out.println("\n Booking cab for user at Bangalore");
		BookingRequest request = new BookingRequest("Mangalore");
		
		dispatcher.dispatchCab(request).ifPresentOrElse(
				cab -> System.out.println("\n Cabs assigned .." + cab),
				() -> System.out.println("\n No cab is available for your location"));
		
		System.out.println("\n Updated cab availablity");
		dispatcher.showCabs();
		
	}

}
