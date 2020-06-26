package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.TipoCarga;
import pe.edu.idat.slogistica.model.MTipoCarga;
import pe.edu.idat.slogistica.repository.RTipoCarga;

@Component
public class STipoCarga implements ServicesCRUD<MTipoCarga> {

	@Autowired
	private RTipoCarga repository;

	@Override
	public List<MTipoCarga> lista() {
		// TODO Auto-generated method stub
		List<MTipoCarga> lista = new ArrayList<>();
		for(TipoCarga a : ((List<TipoCarga>)repository.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MTipoCarga(a));
		}
		return lista;
	}

	@Override
	public MTipoCarga buscar(int id) {
		// TODO Auto-generated method stub
		try {
			MTipoCarga tipocarga = null;
			for(MTipoCarga a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				tipocarga= a;
			}
			return tipocarga;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MTipoCarga t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
		
			return "Tipo de Carga registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MTipoCarga t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
			return "Tipo de Carga actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MTipoCarga t) {
		// TODO Auto-generated method stub
		try {
			TipoCarga eliminar = invertir(t);
			eliminar.setVisible(0);
			repository.save(eliminar);		
			return "Tipo de Carga eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public TipoCarga invertir(MTipoCarga tipocarga) {
		return new TipoCarga(
				tipocarga.getId(),
				tipocarga.getNombre(),
				tipocarga.getVisible()
				);
	}	

}
