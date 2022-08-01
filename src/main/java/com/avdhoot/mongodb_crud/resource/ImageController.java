package com.avdhoot.mongodb_crud.resource;

import java.util.List;
import java.util.Optional;

import com.avdhoot.mongodb_crud.model.Image;
import com.avdhoot.mongodb_crud.service.ImageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImageController {

    @Autowired
    private ImageService service;
    
    @GetMapping("")
    public String getHomePage(Model model){
        return findPages(1, model);
    }

    @GetMapping("/show/{id}")
    public String getImageById(@PathVariable String id, Model model){
        Optional<Image> image = service.getImageById(id);
        Image obtainedImage = image.get();
        model.addAttribute("image",obtainedImage);
        return "image";
    }

    @GetMapping("/delete/{id}")
    public String deleteImageById(@PathVariable String id){
        service.deleteImageById(id);
        return "redirect:/";
    }

    @GetMapping("/new")
    public String getForm(Model model){
        Image img = new Image();
        model.addAttribute("img",img);
        return "form";
    }

    @PostMapping("/")
    public String addImage(@ModelAttribute("img") Image img){
        service.addImage(img);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String getUpdateForm(@PathVariable String id, Model model){
        Image img = service.getImageById(id).get();
        model.addAttribute("img", img);
        return "update_image";
    }

    @PostMapping("/{id}/edit")
    public String updateForm(@ModelAttribute("img") Image img, @PathVariable String id){
        Image image = service.getImageById(id).get();
        image.setId(img.getId());
        image.setImgDetails(img.getImgDetails());
        image.setImgName(img.getImgName());
        image.setImgUrl(img.getImgUrl());
        service.addImage(image);
        return "redirect:/";
    }

    @GetMapping("/page/{pageNo}")
    public String findPages(@PathVariable int pageNo, Model model){
        int pageSize = 9;
        Page<Image> page = service.findPaginated(pageNo, pageSize);
        List<Image> listOfImages = page.getContent();
        model.addAttribute("currentPage",pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listOfImages", listOfImages);

        return "index";
    }
    
}
