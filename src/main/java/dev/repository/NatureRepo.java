package dev.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.domain.Nature;

public interface NatureRepo extends JpaRepository<Nature, UUID> {

}
