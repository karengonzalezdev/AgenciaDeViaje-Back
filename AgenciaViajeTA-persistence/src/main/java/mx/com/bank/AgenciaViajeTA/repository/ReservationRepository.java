package mx.com.bank.AgenciaViajeTA.repository;

import mx.com.bank.AgenciaViajeTA.model.ReservationEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
	
	Optional<ReservationEntity> searchById(Long id);
	
}
