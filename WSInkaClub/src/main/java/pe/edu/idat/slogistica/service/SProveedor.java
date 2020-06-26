package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Proveedor;
import pe.edu.idat.slogistica.model.MProveedor;
import pe.edu.idat.slogistica.repository.RProveedor;

@Component
public class SProveedor implements ServicesCRUD<MProveedor> {
	
	@Autowired
	private RProveedor repository;
	@Autowired
	private SDistrito compDistrito;
	
	@Override
	public List<MProveedor> lista() {
		// TODO Auto-generated method stub
		List<MProveedor> lista = new ArrayList<>();
		for(Proveedor a : ((List<Proveedor>)repository.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MProveedor(a));
		}
		return lista;
	}

	@Override
	public MProveedor buscar(int id) {
		// TODO Auto-generated method stub
		try {
			MProveedor proveedor = null;
			for(MProveedor a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				proveedor= a;
			}
			return proveedor;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MProveedor t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));		
			return "Proveedor registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MProveedor t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
			return "Proveedor actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MProveedor t) {
		// TODO Auto-generated method stub
		try {
			Proveedor eliminar = invertir(t);
			eliminar.setVisible(0);
			repository.save(eliminar);		
			return "Proveedor eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Proveedor invertir(MProveedor proveedor) {
		return new Proveedor(
				proveedor.getId(),
				proveedor.getRuc(),
				proveedor.getrSocial(),
				proveedor.getcFacturacion(),
				proveedor.getiContrato(),
				proveedor.getfContrato(),
				proveedor.getTelefono(),
				proveedor.getDireccion(),
				proveedor.getEmail(),
				proveedor.getRepresentante(),
				proveedor.getVisible(),
				compDistrito.invertir(compDistrito.buscar(proveedor.getIdDistrito()))
				);
	}
}
