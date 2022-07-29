package com.api.maisagua.repositories;

import com.api.maisagua.models.ProblemaModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class ProblemaRepository implements JpaRepository<ProblemaModel, Id> {

    @Override
    public List<ProblemaModel> findAll() {
        return null;
    }

    @Override
    public List<ProblemaModel> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ProblemaModel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<ProblemaModel> findAllById(Iterable<Id> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Id id) {

    }

    @Override
    public void delete(ProblemaModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Id> ids) {

    }

    @Override
    public void deleteAll(Iterable<? extends ProblemaModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends ProblemaModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ProblemaModel> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ProblemaModel> findById(Id id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Id id) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends ProblemaModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends ProblemaModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<ProblemaModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Id> ids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ProblemaModel getOne(Id id) {
        return null;
    }

    @Override
    public ProblemaModel getById(Id id) {
        return null;
    }

    @Override
    public ProblemaModel getReferenceById(Id id) {
        return null;
    }

    @Override
    public <S extends ProblemaModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ProblemaModel> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ProblemaModel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ProblemaModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ProblemaModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ProblemaModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ProblemaModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
