package com.cotacao.src.main.apixplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.src.apiexemplo.domain.sojaneiro;

@Repository
public interface IPessoaRepository extends JpaRepository<sojaneiro, Long>{

}