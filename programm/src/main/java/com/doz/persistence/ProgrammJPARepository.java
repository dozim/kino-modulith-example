package com.doz.persistence;

import com.doz.business.Programm;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammJPARepository extends PagingAndSortingRepository<Programm, Long> {

}
