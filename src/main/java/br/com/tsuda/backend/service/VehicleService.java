package br.com.tsuda.backend.service;

import br.com.tsuda.backend.controller.dto.request.VehicleRequestDto;
import br.com.tsuda.backend.controller.dto.request.VehicleUpdateRequestDto;
import br.com.tsuda.backend.controller.dto.response.VehicleResponseDto;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;

public interface VehicleService {
    VehicleResponseDto create(VehicleRequestDto request);

    List<VehicleResponseDto> getAll();

    VehicleResponseDto getById(int id);

    VehicleResponseDto update(int id, VehicleUpdateRequestDto request);

    void delete(int id);
}
