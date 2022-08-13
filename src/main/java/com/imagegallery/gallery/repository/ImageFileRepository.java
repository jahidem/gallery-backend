package com.imagegallery.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imagegallery.gallery.model.ImageFile;


public interface ImageFileRepository extends JpaRepository<ImageFile,Integer>{
  
  
}
