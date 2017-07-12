package com.uda.SpringDataOracle.dao;

import com.uda.SpringDataOracle.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by enzamora on 12/07/17.
 */
public interface UsuarioPageableRepository extends PagingAndSortingRepository<User,Long> {




}
