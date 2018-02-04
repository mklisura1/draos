package order.service;

import java.util.List;

import order.model.Reservation;

public interface ReservationService {
	public void addReservation(Reservation reservation);
	public void updateReservation(Reservation reservation);
	public Reservation getReservation(int reservation_id);
	public void deleteReservation(int reservation_id);
	public List<Reservation> getReservations();

}
