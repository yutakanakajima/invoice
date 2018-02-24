package jp.dip.invoiceapp.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.dip.invoiceapp.app.entity.ClientTbl;

/**
 * 
 */
public interface ClientRepository extends JpaRepository<ClientTbl, Integer> {

	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */
	List<ClientTbl> findAll();
}
