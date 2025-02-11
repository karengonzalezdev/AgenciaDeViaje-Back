package mx.com.bank.AgenciaViajeTA.service;

import java.util.List;


import mx.com.bank.AgenciaViajeTA.dto.FlightDTO;
import mx.com.bank.AgenciaViajeTA.dto.RespuestaDTO;

public interface FlightService {
	List<FlightDTO> getFlights();
	List<FlightDTO> searchFlightAirline(String airline);
	List<FlightDTO> searchFlightCityOrigin(String airline);
	List<FlightDTO> searchFlightCityDestination(String airline);
	FlightDTO createFlight(FlightDTO newFlight);
	FlightDTO updateFlight(FlightDTO newFlight);
	RespuestaDTO deleteFlight(Long id);
	FlightDTO updateStatus(FlightDTO newFlight);
	FlightDTO getInformation(Long id);
	

}
