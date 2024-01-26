package axonmallorchestrationsaga.query;

//<<< API / HATEOAS
// import org.springframework.data.rest.core.annotation.RestResource;
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//>>> API / HATEOAS

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path = "orderStatuses", collectionResourceRel = "orderStatuses")
public interface OrderReadModelRepository
    extends JpaRepository<OrderReadModel, String> {
    //<<< API / HATEOAS
    /*
    @Override
    @RestResource(exported = false)
    void delete(OrderStatus entity);

    @Override
    @RestResource(exported = false)
    void deleteAll();

    @Override
    @RestResource(exported = false)
    void deleteById(Long id);

    @Override
    @RestResource(exported = false)
     <S extends OrderStatus> S save(S entity);
*/
    //>>> API / HATEOAS

}
