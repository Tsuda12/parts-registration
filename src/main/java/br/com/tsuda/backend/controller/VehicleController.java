package br.com.tsuda.backend.controller;

import br.com.tsuda.backend.controller.dto.request.VehicleRequestDto;
import br.com.tsuda.backend.controller.dto.request.VehicleUpdateRequestDto;
import br.com.tsuda.backend.controller.dto.response.VehicleResponseDto;
import br.com.tsuda.backend.service.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @Operation(summary = "Create vehicle")
    @PostMapping
    public VehicleResponseDto create(@RequestBody @Valid VehicleRequestDto request) {
        return vehicleService.create(request);
    }

    @Operation(summary = "Get all vehicles")
    @GetMapping
    public List<VehicleResponseDto> getAll() {
        return vehicleService.getAll();
    }

    @Operation(summary = "Get vehicle by id")
    @GetMapping("/{id}")
    public VehicleResponseDto getById(@PathVariable int id) {
        return vehicleService.getById(id);
    }

    @Operation(summary = "Update vehicle")
    @PutMapping("/{id}")
    public VehicleResponseDto update(@PathVariable int id, @RequestBody VehicleUpdateRequestDto request) {
        return vehicleService.update(id, request);
    }

    @Operation(summary = "Delete vehicle")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        vehicleService.delete(id);
    }
}
