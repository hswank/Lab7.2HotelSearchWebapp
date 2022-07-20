package GC.Lab72;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("hotels")
public class Hotel {
	@Id
	private String id;
	private String hotelName;
	private String city;
	private int pricePerNight;
	
	public Hotel() {
		super();
	}
	
	public Hotel(String hotelName, String city, int pricePerNight) {
		this.hotelName = hotelName;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}
	
	public Hotel(String id, String hotelName, String city, int pricePerNight) {
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	
}
