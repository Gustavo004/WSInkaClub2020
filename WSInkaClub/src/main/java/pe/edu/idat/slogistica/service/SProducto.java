package pe.edu.idat.slogistica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.idat.slogistica.entity.Producto;
import pe.edu.idat.slogistica.model.MProducto;
import pe.edu.idat.slogistica.repository.RProducto;

@Component
public class SProducto implements ServicesCRUD<MProducto> {
	
	@Autowired
	private RProducto repository;
	@Autowired
	private SCategoria compCategoria;
	@Autowired
	private STipoCarga compTipoCarga;
	
	@Override
	public List<MProducto> lista() {
		// TODO Auto-generated method stub		
		List<MProducto> lista = new ArrayList<>();
		for(Producto a : ((List<Producto>)repository.findAll()).stream().filter(x->x.getVisible()!=0).collect(Collectors.toList())) {
			lista.add(new MProducto(a));
		}
		return lista;
	}

	@Override
	public MProducto buscar(int id) {
		// TODO Auto-generated method stub
		try {
			MProducto producto = null;
			for(MProducto a : lista().stream().filter(x->x.getId()==id).collect(Collectors.toList())) {
				producto= a;
			}
			return producto;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String registrar(MProducto t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
		
			return "Producto registrado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String actualizar(MProducto t) {
		// TODO Auto-generated method stub
		try {
			repository.save(invertir(t));
			return "Producto actualizado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String eliminar(MProducto t) {
		// TODO Auto-generated method stub
		try {
			Producto eliminar = invertir(t);
			eliminar.setVisible(0);
			repository.save(eliminar);		
			return "Producto eliminado correctamente";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public Producto invertir(MProducto producto) {
		return new Producto(
				producto.getId(),
				producto.getNombre(),
				producto.getVisible(),
				compCategoria.invertir(compCategoria.buscar(producto.getIdCategoria())),
				compTipoCarga.invertir(compTipoCarga.buscar(producto.getIdTipocarga()))
				);
	}
}
