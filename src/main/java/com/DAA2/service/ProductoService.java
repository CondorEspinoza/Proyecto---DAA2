package com.DAA2.service;

import java.util.Optional;

import com.DAA2.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto>get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
}
