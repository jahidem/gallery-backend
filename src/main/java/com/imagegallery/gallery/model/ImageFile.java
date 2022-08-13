package com.imagegallery.gallery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jayway.jsonpath.internal.function.text.Length;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ImageFile")
@Getter
@Setter
public class ImageFile {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "imageFileId")
  private Integer imageFileId;

  @Column(name= "imageFileUUID", length = 40)

  private String imageFileUUID;
  
  
}
