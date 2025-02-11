package mx.com.bank.AgenciaViajeTA.repository;

import mx.com.bank.AgenciaViajeTA.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    @Query(value = "select * from ROLE_TA where TIPOROLE like %:tipoRole%", nativeQuery = true)
    Optional<RoleEntity> findByRole(String tipoRole);
}
