package com.lingyun.study.springcloud.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CommonRepository <T, ID> {
    @PersistenceContext
    protected EntityManager em;
    //伪代码，假装实现了吧
    public T findEntityByUniqueProperty(String property,Object value){
            return null;
        }
}
