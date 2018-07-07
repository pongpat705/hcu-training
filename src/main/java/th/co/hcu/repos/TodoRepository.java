package th.co.hcu.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import th.co.hcu.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>, PagingAndSortingRepository<Todo, Long>, CrudRepository<Todo, Long>{

}
