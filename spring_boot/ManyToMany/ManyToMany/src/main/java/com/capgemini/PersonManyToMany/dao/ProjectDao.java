package com.capgemini.PersonManyToMany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.PersonManyToMany.entity.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

}
