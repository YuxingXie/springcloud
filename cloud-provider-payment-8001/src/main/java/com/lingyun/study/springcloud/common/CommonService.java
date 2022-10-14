package com.lingyun.study.springcloud.common;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;

public abstract class CommonService<T,ID,R extends JpaRepository<T, ID>> extends CommonRepository<T, ID> implements JpaRepository<T,ID>  {
    private R repository;
    public CommonService(R repository) {
        this.repository = repository;
    }
    @Override
    public List<T> findAll() {
        return repository.findAll();
    }
    @Override
    public void deleteInBatch(Iterable<T> entities) {
        repository.deleteInBatch(entities);
    }
    @Override
    public List<T> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<T> findAllById(Iterable<ID> ids) {
        return findAllById(ids);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(T entity) {
        repository.delete(entity);
    }

//    @Override
//    public void deleteAllById(Iterable<? extends ID> ids) {
//        repository.deleteAllById(ids);
//    }

    @Override
    public void deleteAll(Iterable<? extends T> entities) {
        repository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public <S extends T> S save(S entity) {
        return repository.save(entity);
    }

    @Override
    public <S extends T> List<S> saveAll(Iterable<S> entities) {
        return repository.saveAll(entities);
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    /**
     * 这个不是接口约定方法，是我自己加的，是为了简化public Optional<T> findById(ID id)这个方法
     * 方法命名似乎还有改进空间
     * @param id
     * @return
     */
    public T findEntityById(ID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }

    @Override
    public void flush() {
        repository.flush();
    }

    @Override
    public <S extends T> S saveAndFlush(S entity) {
        return repository.saveAndFlush(entity);
    }

//    @Override
//    public <S extends T> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return repository.saveAllAndFlush(entities);
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<T> entities) {
//        repository.deleteAllInBatch(entities);
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<ID> ids) {
//        repository.deleteAllByIdInBatch(ids);
//    }

    @Override
    public void deleteAllInBatch() {
        repository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public T getOne(ID id) {
        return repository.getOne(id);
    }

//    @Override
//    @Deprecated
//    public T getById(ID id) {
//        return repository.getById(id);
//    }
//
//    @Override
//    public T getReferenceById(ID id) {
//        return repository.getReferenceById(id);
//    }

    @Override
    public <S extends T> Optional<S> findOne(Example<S> example) {
        return repository.findOne(example);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example) {
        return repository.findAll(example);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
        return repository.findAll(example, sort);
    }

    @Override
    public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
        return repository.findAll(example, pageable);
    }

    @Override
    public <S extends T> long count(Example<S> example) {
        return repository.count(example);
    }

    @Override
    public <S extends T> boolean exists(Example<S> example) {
        return repository.exists(example);
    }

//    @Override
//    public <S extends T, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return repository.findBy(example, queryFunction);
//    }
}
