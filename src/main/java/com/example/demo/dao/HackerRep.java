package com.example.demo.dao;

import com.example.demo.model.Hack;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * com.example.demo.dao
 * 94936
 * 2018/1/5
 * 14:22
 * mySpringBoot
 **/
@CacheConfig(cacheNames = "xhsAccessLimit")
public interface HackerRep extends JpaRepository<Hack,Integer> {
    @Cacheable
    @Query(nativeQuery = true, value = "select o.* from HEIMA_TEST o where o.sex=?1")
    List<Hack> getAccessLimitList(String type);
}
