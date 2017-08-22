package com.model2.mvc.service.product;

import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;

// Service가 Dao 와 같거나 많은 수의 Method를 가진다.
///Method TTL : 4EA
public interface ProductService {
	
	// 상품 등록
	public void addProduct(Product product) throws Exception;

	// 상품 정보 확인
	public Product getProduct(int prodNo) throws Exception;

	// 상품 정보 리스트
	public Map<String,Object> getProductList(Search search) throws Exception;

	// 상품 정보 수정
	public void updateProduct(Product product) throws Exception;
	
}
