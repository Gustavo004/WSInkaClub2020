package pe.edu.idat.slogistica.service;

import java.util.List;

public interface ServicesCRUD<T> {
	public List<T> lista();
	public T buscar(int id);
	public String registrar (T t);
	public String actualizar (T t);
	public String eliminar(T t);
	
}
