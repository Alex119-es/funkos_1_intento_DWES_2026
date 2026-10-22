package com.daw2.funkos.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public record Producto (
    Long id,
    String nombre,
    BigDecimal precio,
    Integer cantidad,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
    ){}
