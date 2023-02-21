package com.gk.userregandlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gk.userregandlog.model.User;

public interface UserRepository extends JpaRepository<User, Long>, PagingAndSortingRepository<User, Long> {

}
