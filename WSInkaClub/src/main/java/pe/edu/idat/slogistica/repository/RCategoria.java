package pe.edu.idat.slogistica.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.idat.slogistica.entity.Categoria;
@Repository
public interface RCategoria extends CrudRepository<Categoria, Integer> {

}
