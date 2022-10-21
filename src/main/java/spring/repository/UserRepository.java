package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
