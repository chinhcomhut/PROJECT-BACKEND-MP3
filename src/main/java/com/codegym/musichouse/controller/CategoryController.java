package com.codegym.musichouse.controller;

import com.codegym.musichouse.model.Category;
import com.codegym.musichouse.service.CategoryService;
import com.codegym.musichouse.service.Impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 21600000)
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getCategory() {
        List<Category> categories = categoryService.findAll();
        return new  ResponseEntity<>(categories, HttpStatus.OK);
    }
}
