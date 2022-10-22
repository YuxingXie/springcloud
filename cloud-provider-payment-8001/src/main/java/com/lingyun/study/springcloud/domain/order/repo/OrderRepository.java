package com.lingyun.study.springcloud.domain.order.repo;

import com.lingyun.study.springcloud.domain.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{
}
