package com.avdhoot.mongodb_crud.service;

import java.util.List;
import java.util.Optional;

import com.avdhoot.mongodb_crud.model.Image;
import com.avdhoot.mongodb_crud.repository.ImageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    
    @Autowired
    private ImageRepository repository;

    public String addImage(Image image){
        repository.save(image);
        return "Image saved";
    }

    public List<Image> getAllImages(){
        return repository.findAll();
    }

    public Optional<Image> getImageById(String id){
        return repository.findById(id); 
    }

    public String deleteImageById(String id){
        repository.deleteById(id);
        return "Image deleted";
    }

    public Page<Image> findPaginated(int pageNo, int pageSize){
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return repository.findAll(pageable);
    }
}
