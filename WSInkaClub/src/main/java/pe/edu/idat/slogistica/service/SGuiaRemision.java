package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.GuiaRemision;
import pe.edu.idat.slogistica.model.MGuiaRemision;
import pe.edu.idat.slogistica.repository.RGuiaRemision;

@Component
public class SGuiaRemision implements ServicesCRUD<MGuiaRemision> {

	@Autowired
	private RGuiaRemision rGuiaRemision;

	@Autowired
	private SFactura sFactura;

	@Override
	public List<MGuiaRemision> lista() {
		List<MGuiaRemision> lista = new ArrayList<>();
		for (GuiaRemision g : ((List<GuiaRemision>) rGuiaRemision.findAll()).stream().filter(x -> x.getVisible() != 0)
				.collect(Collectors.toList())) {
			lista.add(new MGuiaRemision(g));
		}
		return lista;
	}

	@Override
	public MGuiaRemision buscar(int id) {
		try {
			MGuiaRemision guia = null;
			for (MGuiaRemision g : lista().stream().filter(x -> x.getId() == id).collect(Collectors.toList())) {
				guia = g;
			}
			return guia;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MGuiaRemision t) {
		try {
			rGuiaRemision.save(invertir(t));
			return "Guia de remision se registro correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MGuiaRemision t) {
		try {
			rGuiaRemision.save(invertir(t));
			return "Guia de remision se actualizo correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MGuiaRemision t) {
		try {
			GuiaRemision guia = invertir(t);
			guia.setVisible(0);
			rGuiaRemision.save(guia);
			return "Guia de remision se elimino correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	private GuiaRemision invertir(MGuiaRemision g) {
		return new GuiaRemision(g.getId(), 
				g.getfRegistro(), g.getpPartida(), 
				g.getpLlegada(), g.getMotivo(), 
				g.getDniTransportista(), g.getnTransportista(), 
				g.getLicencia(), g.getPlaca(), g.getMarca(), 
				g.getVisible(), sFactura.invertir(sFactura.buscar(g.getIdFactura())));
	}

}
