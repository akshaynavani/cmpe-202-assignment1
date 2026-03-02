public class Flight {

	public String flightNumber;

	public LocalDateTime detartureTime;

	public LocalDateTime arrivalTime;

	public FlightStatus status;

	public Duration getDuration() {
		return null;
	}

	public void assignAirplane(Airplane a) {

	}

	public void assignPilots(Pilot captain, Pilot firstOﬃcer) {

	}

	public SeatAssignment bookSeat(Passenger passenger, Seat seat) {
		return null;
	}

	public void cancelAssignment(SeatAssignment a) {

	}

}
