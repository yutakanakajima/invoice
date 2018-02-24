package jp.dip.invoiceapp.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.dip.invoiceapp.app.entity.OrderTbl;

public interface OrderRepository extends JpaRepository<OrderTbl, Integer> {

	List<OrderTbl> findAll();
	
}
