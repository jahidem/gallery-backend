package com.imagegallery.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imagegallery.gallery.repository.ImageFileRepository;
import com.imagegallery.gallery.model.ImageFile;


@RestController
@RequestMapping("/gallery")
public class ImageFileController {

  @Autowired
  ImageFileRepository imageFileRepository;

  @CrossOrigin
  @GetMapping("")
  public  List<ImageFile> getAllImages(){
    return imageFileRepository.findAll();
  }

  @PostMapping("/post")
  @CrossOrigin
  public String saveImage(@RequestBody ImageFile imageFile ){
    imageFileRepository.save(imageFile);    
    return imageFile.getImageFileUUID();
  }
}
