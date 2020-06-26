package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Trabajador;
import pe.edu.idat.slogistica.model.MTrabajador;
import pe.edu.idat.slogistica.repository.RTrabajador;

@Component
public class STrabajador implements ServicesCRUD<MTrabajador> {
	
	@Autowired
	private RTrabajador repository;
	@Autowired
	private SCargo compCargo;
	@Autowired
	private SDistrito compDistrito;
	@Autowired
	private SCliente compCliente;
	
	
	@Override
	public List<MTrabajador> lista() {
		// TODO Auto-generated method stub
		List<MTrabajador> lista = new ArrayList<>();
		for(Trabajador a : ((List<Trabajador>)repository.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MTrabajador(a));
		}
		return lista;
	}

	@Override
	public MTrabajador buscar(int id) {
		// TODO Auto-generated method stub
		try {
			MTrabajador trabajador = null;
			for(MTrabajador a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				trabajador= a;
			}
			return trabajador;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MTrabajador t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));		
			return "Trabajador registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MTrabajador t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
			return "Trabajador actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MTrabajador t) {
		// TODO Auto-generated method stub
		try {
			Trabajador eliminar = invertir(t);
			eliminar.setVisible(0);
			repository.save(eliminar);		
			return "Trabajador eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Trabajador invertir(MTrabajador trabajador) {
		return new Trabajador(
				trabajador.getId(),
				trabajador.getNombres(),
				trabajador.getApellidos(),
				trabajador.getfNacimiento(),
				trabajador.gettDocumento(),
				trabajador.getnDocumento(),
				trabajador.getSexo(),
				trabajador.geteCivil(),
				trabajador.getTelefono(),
				trabajador.getEmail(),
				trabajador.getDireccion(),
				trabajador.getfRegistro(),
				trabajador.getLogin(),
				trabajador.getClave(),
				trabajador.getVisible(),
				compCargo.invertir(compCargo.buscar(trabajador.getIdCargo())),
				compDistrito.invertir(compDistrito.buscar(trabajador.getIdDistrito())),
				compCliente.invertir(compCliente.buscar(trabajador.getIdCliente()))
				);
	}

}
