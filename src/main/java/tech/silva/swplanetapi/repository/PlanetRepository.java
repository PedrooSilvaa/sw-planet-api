package tech.silva.swplanetapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tech.silva.swplanetapi.entity.Planet;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
