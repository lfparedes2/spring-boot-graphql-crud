package com.app.ecom.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Producto {

    @Id
    private String id;

    private String nombre;
    private Double precio;
    private int cantidad;

    @ManyToOne
    private Categoria categoria;
}
