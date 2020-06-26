package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Categoria;
import pe.edu.idat.slogistica.model.MCategoria;
import pe.edu.idat.slogistica.repository.RCategoria;

@Component
public class SCategoria implements ServicesCRUD<MCategoria> {
	@Autowired
	private RCategoria repository;
		
	@Override
	public List<MCategoria> lista() {
		// TODO Auto-generated method stub
		List<MCategoria> lista = new ArrayList<>();
		for(Categoria a : ((List<Categoria>)repository.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MCategoria(a));
		}
		return lista;
	}

	@Override
	public MCategoria buscar(int id) {
		// TODO Auto-generated method stub
		try {
			MCategoria categoria = null;
			for(MCategoria a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				categoria= a;
			}
			return categoria;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MCategoria t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
		
			return "Categoria registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MCategoria t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
			return "Categoria actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MCategoria t) {
		// TODO Auto-generated method stub
		try {
			Categoria eliminar = invertir(t);
			eliminar.setVisible(0);
			repository.save(eliminar);		
			return "Categoria eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Categoria invertir(MCategoria categoria) {
		return new Categoria(
				categoria.getId(),
				categoria.getNombre(),
				categoria.getVisible()
				);
	}

}
