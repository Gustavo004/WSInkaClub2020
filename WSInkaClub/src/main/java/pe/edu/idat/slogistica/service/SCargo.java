package pe.edu.idat.slogistica.service;

import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Cargo;
import pe.edu.idat.slogistica.model.MCargo;
import pe.edu.idat.slogistica.repository.RCargo;

@Component
public class SCargo implements ServicesCRUD<MCargo>{
	@Autowired
	private RCargo repository;
	
	@Override
	public List<MCargo> lista() {	
		List<MCargo> lista = new ArrayList<>();
		for(Cargo a : ((List<Cargo>)repository.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MCargo(a));
		}
		return lista;
	}

	@Override
	public MCargo buscar(int id) {		
		try {
			MCargo articulo = null;
			for(MCargo a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				articulo = a;
			}
			return articulo;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}		
	}

	@Override
	public String registrar(MCargo t) {
		try {
			repository.save(invertir(t));
			return "Cargo registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MCargo t) {
		try {
			repository.save(invertir(t));
			return "Cargo actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MCargo t) {
		try {
			Cargo eliminar = invertir(t);
			eliminar.setVisible(0);
			repository.save(eliminar);
			return "Cargo eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Cargo invertir(MCargo cargo) {
		return new Cargo(
				cargo.getId(),
				cargo.getCargo(),
				cargo.getVisible()
				);
	}

}
