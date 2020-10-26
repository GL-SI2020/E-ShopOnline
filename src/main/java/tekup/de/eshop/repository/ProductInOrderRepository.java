package tekup.de.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tekup.de.eshop.model.ProductInOrder;


@Repository

public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
