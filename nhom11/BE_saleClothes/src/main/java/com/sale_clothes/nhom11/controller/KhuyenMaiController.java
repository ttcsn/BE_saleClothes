package com.sale_clothes.nhom11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sale_clothes.nhom11.dto.KhuyenMaiDTO;
import com.sale_clothes.nhom11.service.impl.KhuyenMaiServiceImpl;

@RestController
@RequestMapping("/api")
public class KhuyenMaiController {
    @Autowired
    private KhuyenMaiServiceImpl khuyenMaiServiceImpl;

    @PostMapping("/khuyenmais")
    public ResponseEntity<KhuyenMaiDTO> createKhuyenMai(@RequestBody KhuyenMaiDTO khuyenMaiDTO) {
        KhuyenMaiDTO saveKhuyenMai = khuyenMaiServiceImpl.createKhuyenMai(khuyenMaiDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveKhuyenMai);
    }
}
