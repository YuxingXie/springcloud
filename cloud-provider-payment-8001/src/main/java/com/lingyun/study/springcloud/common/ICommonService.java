package com.lingyun.study.springcloud.common;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import java.util.List;
import java.util.Optional;

public interface ICommonService<T,ID> {

   
    public List<T> findAll() ;
   
    public void deleteInBatch(Iterable<T> entities) ;
   
    public List<T> findAll(Sort sort) ;

   
    public Page<T> findAll(Pageable pageable);
   
    public List<T> findAllById(Iterable<ID> ids) ;

   
    public long count() ;
   
    public void deleteById(ID id) ;

   
    public void delete(T entity) ;

    public void deleteAll(Iterable<? extends T> entities) ;

    public void deleteAll() ;

    public <S extends T> S save(S entity) ;

    public <S extends T> List<S> saveAll(Iterable<S> entities) ;

    public Optional<T> findById(ID id) ;
    /**
     * 这个不是接口约定方法，是我自己加的，是为了简化public Optional<T> findById(ID id)这个方法
     * 方法命名似乎还有改进空间
     * @param id
     * @return
     */
    public T findEntityById(ID id) ;
   
    public boolean existsById(ID id) ;
    public void flush();
   
    public <S extends T> S saveAndFlush(S entity) ;

    public void deleteAllInBatch() ;
   
    @Deprecated
    public T getOne(ID id) ;

    public <S extends T> Optional<S> findOne(Example<S> example) ;

    public <S extends T> List<S> findAll(Example<S> example);
   
    public <S extends T> List<S> findAll(Example<S> example, Sort sort) ;

    public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) ;

    public <S extends T> long count(Example<S> example) ;

    public <S extends T> boolean exists(Example<S> example);
}
