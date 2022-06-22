package weslleylins.springbootcrudrestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weslleylins.springbootcrudrestful.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
