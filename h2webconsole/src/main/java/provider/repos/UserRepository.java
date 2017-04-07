package provider.repos;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import provider.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}