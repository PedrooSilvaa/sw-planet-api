package tech.silva.swplanetapi.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.silva.swplanetapi.entity.Planet;
import tech.silva.swplanetapi.repository.PlanetRepository;
import tech.silva.swplanetapi.service.PlanetService;
import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.when;
import static tech.silva.swplanetapi.common.PlanetConstants.PLANET;

@ExtendWith(MockitoExtension.class)
public class PlanetServiceTest {

    @InjectMocks
    private PlanetService planetService;

    @Mock
    private PlanetRepository planetRepository;

    @Test
    public void createPlanet_WithValidData_ReturnsPlanet(){
        // AAA
        // ARRANGE
        when(planetRepository.save(PLANET)).thenReturn(PLANET);

        // ACT
        Planet sut = planetService.create(PLANET);

        // ASSERT
        assertThat(sut).isEqualTo(PLANET);
    }

}
