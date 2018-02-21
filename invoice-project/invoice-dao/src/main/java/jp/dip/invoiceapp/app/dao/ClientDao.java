package jp.dip.invoiceapp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.dip.invoiceapp.app.entity.ClientTbl;

public interface ClientDao extends JpaRepository<ClientTbl, Integer> {

}
