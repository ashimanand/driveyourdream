package com.ashim.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashim.entity.CarEntity;
import com.ashim.enums.CarStatus;
import com.ashim.model.AddCarRequest;
import com.ashim.repo.CarsRepository;

@RestController
@RequestMapping(path= "car")
public class CarController {
	
	@Autowired
	CarsRepository carRepo;
	
	@PostMapping(path="addcar")
	public ResponseEntity<Object> addCar(@RequestBody AddCarRequest request){
		
		CarEntity addedcar = carRepo.save(
				CarEntity.builder()
				.carNumber(request.getCarNumber())
				.carOwnerId(request.getUserId())
				.manufacturer(request.getManufacturer())
				.model(request.getModel())
				.registrationYear(request.getRegistrationYear())
				.carRegNum(request.getCarRegNum())
				.status(CarStatus.UNDERREVIW)
				.build()
				);
		
		return new ResponseEntity<Object>(addedcar, HttpStatus.OK);
	}
	
	@GetMapping(path="getOCarList/{userId}")
	public ResponseEntity<Object> listCarByOwner(@PathVariable String userId,
												@RequestParam String sessionKey){
		
		return new ResponseEntity<Object>(carRepo.getByCarOwnerId(userId), HttpStatus.OK);
		
	}

}
