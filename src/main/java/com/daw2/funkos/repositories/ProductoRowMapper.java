package com.daw2.funkos.repositories;

import com.daw2.funkos.models.Producto;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Component;

import java.sql.ResultSet;

import java.sql.SQLException;

@Component
public class ProductoRowMapper implements RowMapper<Producto> {

    @Override
    public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Producto(
                rs.getLong("id"),
                rs.getString("nombre"),
                rs.getBigDecimal("precio"),
                rs.getInt("cantidad"),
                rs.getTimestamp("created_at").toLocalDateTime(),
                rs.getTimestamp("updated_at").toLocalDateTime());
    }
}