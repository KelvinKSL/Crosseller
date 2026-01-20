package com.example.crosseller.repo;

import com.example.crosseller.dto.input.search.SearchProductForm;
import com.example.crosseller.dto.output.SelectProduct;
import com.example.crosseller.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductQueryRepository{
    List<SelectProduct> findBy(SearchProductForm form);

	/**
	 * @param form
	 * @return
	 */
	List<SelectProduct> search(SearchProductForm form);


}
