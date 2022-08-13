package com.imagegallery.gallery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imagegallery.gallery.model.ImageFile;


public interface ImageFileRepository extends JpaRepository<ImageFile,Integer>{
  List<ImageFile> findByImageFileUUID(String imageFileUUID);
}
