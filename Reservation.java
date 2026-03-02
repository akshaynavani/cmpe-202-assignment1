public class Reservation {

	public String pnr;

	public LocalDateTime createdAt;

	public ReservationStatus status;

	public void addAssignment(SeatAssignment a) {

	}

	public void cancel() {

	}

	public int totalPassengers() {
		return 0;
	}

}
