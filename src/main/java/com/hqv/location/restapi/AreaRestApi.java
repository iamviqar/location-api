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

import com.hqv.location.entity.Area;
import com.hqv.location.pojo.AreaDto;
import com.hqv.location.service.AreaService;

@RestController
public class AreaRestApi {

	@Autowired
	AreaService areaService;

	@PostMapping("/area")
	public AreaDto saveArea(@RequestBody AreaDto areaDto) {
		areaService.saveArea(areaDto);
		return areaDto;
	}

	/*
	 * @PutMapping("/crea/{id}") public AreaDto updateArea(
	 * 
	 * @RequestBody AreaDto areaDto, @PathVariable("id") long id) {
	 * creaService.updateArea(areaDto, id); return areaDto;
	 * 
	 * }
	 * 
	 * @GetMapping("/crea") public List<Area> getList() { return
	 * this.creaService.getList(); }
	 * 
	 * @GetMapping("/crea/{id}") public Optional<Area>
	 * getAreaById(@PathVariable("id") long id) { return
	 * this.creaService.getAreaById(id); }
	 */

}
