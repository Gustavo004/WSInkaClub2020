package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Factura;
import pe.edu.idat.slogistica.model.MFactura;
import pe.edu.idat.slogistica.repository.RFactura;

@Component
public class SFactura implements ServicesCRUD<MFactura> {

	@Autowired
	private RFactura rFactura;

	@Autowired
	private STrabajador sTrabajador;

	@Override
	public List<MFactura> lista() {
		List<MFactura> lista = new ArrayList<>();
		for (Factura f : ((List<Factura>) rFactura.findAll()).stream().filter(x -> x.getVisible() != 0)
				.collect(Collectors.toList())) {
			lista.add(new MFactura(f));
		}
		return lista;
	}

	@Override
	public MFactura buscar(int id) {
		try {
			MFactura factura = null;
			for (MFactura f : lista().stream().filter(x -> x.getId() == id).collect(Collectors.toList())) {
				factura = f;
			}
			return factura;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MFactura t) {
		try {
			rFactura.save(invertir(t));
			return "Factura registrada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MFactura t) {
		try {
			rFactura.save(invertir(t));
			return "Factura actualizada correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MFactura t) {
		try {
			Factura factura = invertir(t);
			factura.setVisible(0);
			rFactura.save(factura);
			return "Factura eliminada correctamente " ;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	public Factura invertir(MFactura f) {
		return new Factura(f.getId(), f.getRuc(), 
				f.getrSocial(), f.getfRegistro(), 
				f.getSubtotal(), f.getIgv(),
				f.getTotal(), f.getEstado(), 
				f.getVisible(),sTrabajador.invertir(sTrabajador.buscar(f.getIdTrabajador())));
	}

}
