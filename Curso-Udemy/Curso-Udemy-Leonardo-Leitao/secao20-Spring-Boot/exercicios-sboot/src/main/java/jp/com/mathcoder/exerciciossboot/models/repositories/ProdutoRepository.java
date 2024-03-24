package jp.com.mathcoder.exerciciossboot.models.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;

import jp.com.mathcoder.exerciciossboot.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer> {
	
}
