package logic;

public class Ticket {
	// attribute / fields
	private int type;
	private int priceperstation;
	
	private Station start;
	private Station end;

	// constructor
	public Ticket(int type,Station start,Station end) {
		setType(type);
		setStation(start,end);
	}

	// getter-setter method
	public int getType() {
		return type;
	}
	
	public int getPricePerStation() {
		return priceperstation;
	}
	
	public Station getStart() {
		return start;
	}
	
	public Station getEnd() {
		return end;
	}
	
	public void setType(int type) { // should get pricePerStation
		// Case 1 : Invalid (not 0,1,2)
		if (type > 2 || type < 0) Ticket.type = 1 ;
		else Ticket.type = type ;

		// Another Case : Check for each type of passengers
		if (type == 0) { // Student ; 30THB per station , 20% Discount for >4 stations
			this.priceperstation = 30 ;
		}
		else if (type == 1) { // Adult : 30THB per station
			this.priceperstation = 30 ;
		}
		else if (type == 2) { // Elderly : 25THB per Station , 40% Discount
			this.priceperstation = 25 ;
		}
	}

	// another methods
	public void setStation(Station start,Station end) {
		Ticket.start = start ;
		Ticket.end = end ;
	}
	
	public double calculatePrice() {
		// define totalPrice
		int totalPrice = 0 ;

		// check for each case of discount
		if (!isStationValid(start , end)) { // station is invalid
			totalPrice = -1 ;
		}
		else {
			// define price & distance
			int stationDistance = getStationDistance(start , end) ;
			int pricePerStation = getPricePerStation() ;
			totalPrice = stationDistance * pricePerStation ;

			// check type fpr discount
			if (type == 0 && stationDistance > 4) { // 20% discount with distance > 4
				totalPrice *= 0.8 ;
			}
			else if (type == 2) { // elderly
				totalPrice *= 0.6 ;
			}
		}
		return totalPrice ;
	}
	
	public String getDescription() {
		String typename;
		
		switch(type) {
		
		case 0:
			typename = "Student";
			break;
		case 1:
			typename = "Adult" ;
			break ;
		case 2:
			typename = "Elderly" ;
			break ;
		default:
			typename = "Invalid";
		}
		
		return typename + " Ticket, from " + Ticket.start +" to " + Ticket.end ;
	}
	
	public boolean isStationValid(Station start,Station end) {
		if (type == 2 && this.getStationDistance(start, end) > 6) { // <6 station for elderly
			return false;
		}

		if (start == end || start.getName().equals(end.getName())) { // start != end
			return false;
		}
		return true;
	}
	
	public int getStationDistance(Station start,Station end) {
		return Math.abs(start.getNumber() - end.getNumber());
	}
	
}
