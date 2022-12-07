package org.soulcodeacademy.helpr.repositories;


import org.soulcodeacademy.helpr.domain.FuturoCandidato;
import org.soulcodeacademy.helpr.domain.enums.Setor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FuturoCandidatoRepository extends JpaRepository<FuturoCandidato, Integer> {

    Optional<FuturoCandidato> findByEmail(String email);

    List<FuturoCandidato> findByNomeCompleto(String nomeCompleto);

    List<FuturoCandidato> findBySetor(Setor setor);

}
