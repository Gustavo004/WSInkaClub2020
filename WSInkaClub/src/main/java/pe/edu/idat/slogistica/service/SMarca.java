package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Marca;
import pe.edu.idat.slogistica.model.MMarca;
import pe.edu.idat.slogistica.repository.RMarca;

@Component
public class SMarca implements ServicesCRUD<MMarca> {
	@Autowired
	private RMarca repository;
	
	@Override
	public List<MMarca> lista() {
		// TODO Auto-generated method stub
		List<MMarca> lista = new ArrayList<>();
		for(Marca a : ((List<Marca>)repository.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MMarca(a));
		}
		return lista;
	}

	@Override
	public MMarca buscar(int id) {
		// TODO Auto-generated method stub
		try {
			MMarca marca = null;
			for(MMarca a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				marca= a;
			}
			return marca;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MMarca t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
		
			return "Marca registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MMarca t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
			return "Marca actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MMarca t) {
		// TODO Auto-generated method stub
		try {
			Marca eliminar = invertir(t);
			eliminar.setVisible(0);
			repository.save(eliminar);		
			return "Marca eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Marca invertir(MMarca marca) {
		return new Marca(
				marca.getId(),
				marca.getNombre(),
				marca.getVisible()
				);
	}
}
