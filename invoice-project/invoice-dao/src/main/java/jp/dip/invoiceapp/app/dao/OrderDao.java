package jp.dip.invoiceapp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.dip.invoiceapp.app.entity.OrderTbl;

public interface OrderDao extends JpaRepository<OrderTbl, Integer> {

}
