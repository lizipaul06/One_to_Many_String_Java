package com.example.codeclan.onetomany.repositories;

import com.example.codeclan.onetomany.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
