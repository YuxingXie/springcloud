package com.lingyun.study.springcloud.domain.order.service;

import com.lingyun.study.springcloud.common.CommonService;
import com.lingyun.study.springcloud.domain.order.entity.Order;
import com.lingyun.study.springcloud.domain.order.repo.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends CommonService<Order,Long, OrderRepository> implements OrderRepository {
    private OrderRepository orderRepository;
    //不用Autowired也不用Resource注解，使用构造器注入，相信我，这个方法更好。
    public OrderService(OrderRepository orderRepository) {
        super(orderRepository);
        this.orderRepository = orderRepository;
    }




//    public List<Payment> findBySerial(String serial) {
//        return this.paymentRepository.findBySerial(serial);
//    }



}
