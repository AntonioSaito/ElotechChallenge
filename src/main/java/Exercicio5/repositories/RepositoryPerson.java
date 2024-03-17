package Exercicio5.repositories;

import Exercicio5.models.ModelPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPerson extends JpaRepository <ModelPerson, Integer>{
}
