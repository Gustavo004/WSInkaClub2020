package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Inventario;
import pe.edu.idat.slogistica.model.MInventario;
import pe.edu.idat.slogistica.repository.RInventario;

@Component
public class SInventario implements ServicesCRUD<MInventario>{

	@Autowired
	private RInventario rInventario;
	
	@Autowired
	private STrabajador strabajador;

	@Override
	public List<MInventario> lista() {
		List<MInventario> lista = new ArrayList<>();
		for(Inventario i : ((List<Inventario>)rInventario.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MInventario(i));
		}
		return lista;
	}

	@Override
	public MInventario buscar(int id) {
		try {
			MInventario mInventario = null;
			for(MInventario mi : lista().stream().filter(x->x.getId() == id).collect(Collectors.toList())) {
				mInventario = mi;
			}
			return mInventario;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MInventario t) {
		try {
			rInventario.save(invertir(t));
			return "Inventario se registro correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MInventario t) {
		try {
			rInventario.save(invertir(t));
			return "Inventario se actualizo correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MInventario t) {
		try {
			Inventario inven = invertir(t);
			inven.setVisible(0);
			rInventario.save(inven);
			return "el inventario se elimino correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Inventario invertir(MInventario mi) {
		return new Inventario(mi.getId(), mi.getLugar(), 
				mi.getMotivo(), mi.getfFisica(), mi.getfModificacion(), 
				mi.getEstado(), mi.getVisible(), 
				strabajador.invertir(strabajador.buscar(mi.getIdTrabajador())));
	}
	
	
}
