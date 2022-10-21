package com.lingyun.study.springcloud.common;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CommonRepository <T, ID,R extends JpaRepository<T, ID>> {
    @PersistenceContext
    protected EntityManager em;
    //伪代码，假装实现了吧
    public T findEntityByUniqueProperty(String property,Object value){
            return null;
        }
}
