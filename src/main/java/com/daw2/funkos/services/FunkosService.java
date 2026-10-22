package com.daw2.funkos.services;
import com.daw2.funkos.dto.EstadisticasResponse;
import com.daw2.funkos.dto.FunkoCreateRequest;
import com.daw2.funkos.dto.FunkoResponse;
import com.daw2.funkos.dto.FunkoUpdateRequest;

import java.math.BigDecimal;
import java.util.*;

public interface FunkosService {
    List<FunkoResponse> buscar(Optional<String> categoria, Optional<String> nombre,
                               Optional<BigDecimal> precioMax);
    FunkoResponse findById(Long id);
    FunkoResponse save(FunkoCreateRequest funko);
    FunkoResponse replace(Long id, FunkoCreateRequest funko);
    FunkoResponse update(Long id, FunkoUpdateRequest funko);
    void deleteById(Long id);
    EstadisticasResponse estadisticas();
}