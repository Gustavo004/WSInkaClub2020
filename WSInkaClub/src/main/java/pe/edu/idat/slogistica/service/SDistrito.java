package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Distrito;
import pe.edu.idat.slogistica.model.MDistrito;
import pe.edu.idat.slogistica.repository.RDistrito;

@Component
public class SDistrito implements ServicesCRUD<MDistrito> {
	@Autowired
	private RDistrito repository;
	
	@Override
	public List<MDistrito> lista() {
		List<MDistrito> lista = new ArrayList<>();
		for(Distrito a : ((List<Distrito>)repository.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MDistrito(a));
		}
		return lista;
	}

	@Override
	public MDistrito buscar(int id) {
		try {
			MDistrito distrito = null;
			for(MDistrito a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				distrito= a;
			}
			return distrito;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MDistrito t) {
		try {
			repository.save(invertir(t));
			return "Distrito registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MDistrito t) {
		try {
			repository.save(invertir(t));
			return "Distrito actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MDistrito t) {
		try {
			Distrito eliminar = invertir(t);
			eliminar.setVisible(0);
			repository.save(eliminar);
			return "Distrito eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	public Distrito invertir(MDistrito distrito) {
		return new Distrito(
				distrito.getId(),
				distrito.getNombre(),
				distrito.getVisible()
				);
	}

}
