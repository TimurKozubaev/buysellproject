package com.example.buysellproject.repositories;

import com.example.buysellproject.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
