package tekup.de.eshop.service;

import org.springframework.stereotype.Service;

import tekup.de.eshop.model.ProductInOrder;
import tekup.de.eshop.model.User;

public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
