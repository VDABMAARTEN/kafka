package be.vdab.producer;

import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("parkings")
public class ParkingController {
    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @PutMapping("{naam}/vrijeplaatsen")
    void updateVrijePlaatsen(@PathVariable String naam,
                             @RequestBody @PositiveOrZero int vrijePlaatsen) {
        parkingService.updateVrijePlaatsen(naam, vrijePlaatsen);
    }

}
