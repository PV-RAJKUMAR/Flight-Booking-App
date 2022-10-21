package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.OfficerModel;
import spring.model.UserModel;

public interface OfficerRepository extends JpaRepository<OfficerModel, Integer> {
}