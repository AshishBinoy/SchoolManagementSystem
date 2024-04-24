package studentdbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentdbms.entity.Aadhar;

@Repository
public interface AadharRepository extends JpaRepository<Aadhar, Integer>
{

}