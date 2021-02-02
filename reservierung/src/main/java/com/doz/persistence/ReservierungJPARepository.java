package com.doz.persistence;

import com.doz.business.Reservierung;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservierungJPARepository extends PagingAndSortingRepository<Reservierung, Long> {

}
