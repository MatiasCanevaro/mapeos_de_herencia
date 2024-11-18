package models.repositories;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;

import java.util.List;
import java.util.Optional;

public class RepositorioDeObjects implements WithSimplePersistenceUnit {

    public void guardar(Object o) {
        entityManager().persist(o);//INSERT
    }

    public void modificar(Object o) {
        withTransaction(() -> {
            entityManager().merge(o);//UPDATE
        });
    }

    public void eliminarFisico(Object o) {
        entityManager().remove(o);//DELETE
    }

    /*public void eliminar(Object o) {
        o.setActivo(false);
        entityManager().merge(o);
    }*/

    public Optional<Object> buscarPorId(Long id) {
        return Optional.ofNullable(entityManager().find(Object.class, id));
    }

    public Object buscarPorId2(Long id) {
        return entityManager().find(Object.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Object> buscarPorNombre(String nombre) {
        return entityManager()
                .createQuery("from " + Object.class.getName() + " where nombre =:name")
                .setParameter("name", nombre)
                .getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Object> buscarTodos() {
        return entityManager()
                .createQuery("from " + Object.class.getName())
                .getResultList();
    }
}
