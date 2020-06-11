package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Cliente;
import pe.edu.idat.slogistica.model.MCliente;
import pe.edu.idat.slogistica.repository.RCliente;

@Component
public class SCliente implements ServicesCRUD<MCliente> {
	@Autowired
	private RCliente repository;
	@Autowired
	private SDistrito compDistrito;
	
	@Override
	public List<MCliente> lista() {
		List<MCliente> lista = new ArrayList<>();
		for(Cliente a : ((List<Cliente>)repository.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MCliente(a));
		}
		return lista;
	}

	@Override
	public MCliente buscar(int id) {
		try {
			MCliente m = null;
			for(MCliente a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				m= a;
			}
			return m;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MCliente t) {
		try {
			repository.save(invertir(t));
			return "Cliente registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MCliente t) {
		try {
			repository.save(invertir(t));
			return "Cliente actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MCliente t) {
		try {
			Cliente eliminar = invertir(t);
			eliminar.setVisible(0);
			repository.save(eliminar);
			return "Cliente eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	public Cliente invertir(MCliente cliente) {
		return new Cliente(
				cliente.getId(),
				cliente.getTienda(),
				cliente.getTelefono(),
				cliente.getDireccion(),
				cliente.getEmail(),
				cliente.getVisible(),
				compDistrito.invertir(compDistrito.buscar(cliente.getIdDistrito()))
				);
	}
}
