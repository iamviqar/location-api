package com.hqv.location.restapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.location.entity.District;
import com.hqv.location.pojo.DistrictDto;
import com.hqv.location.service.DistrictSrevice;

@RestController

public class DistrictRestapi {
	
	
	  @Autowired DistrictSrevice districtService;
	  
	  @PostMapping("/district") public DistrictDto saveDistrict(
	 
	 @RequestBody DistrictDto districtDto)
	  { System.out.println(districtDto);
	  districtService.saveDistrict(districtDto); 
        return districtDto; 
      }
		@PutMapping("/district/{id}")
		public DistrictDto updateDistrict(

				@RequestBody DistrictDto districtDto, @PathVariable("id") long id) {
			districtService.updateDistrict(districtDto, id);
			return districtDto;

		}

		
		 
		 @GetMapping("/district/list") 
		 public List<District> getList(){
				return this.districtService.getList();
			}
		 
		 @GetMapping("/district/{id}")
			public Optional<District> getCounById(
					@PathVariable("id") long id){
				return this.districtService.getCounById(id);
			}
	

}
