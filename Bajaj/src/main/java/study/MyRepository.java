package study;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.entity;


@Repository
public interface MyRepository extends JpaRepository<entity, String>{

}
