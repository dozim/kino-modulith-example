package com.doz;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RechnungJPARepository extends PagingAndSortingRepository<Rechnung, Long> {

}
