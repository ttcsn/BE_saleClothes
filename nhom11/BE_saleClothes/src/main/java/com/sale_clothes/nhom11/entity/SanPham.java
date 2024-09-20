package com.sale_clothes.nhom11.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="san_pham")
public class SanPham {
    @Id
    @Column(name = "sp_ma")
    private String sp_ma;

    @Column(name = "sp_ten")
    private String sp_ten;

    @Column(name = "sp_gia")
    private double sp_gia;

    @Column(name = "sp_giacu")
    private double sp_giaCu;

    @Column(name = "sp_mota_ngan")
    private  String sp_moTa_ngan;

    @Column(name = "sp_mota_chitiet")
    private String sp_moTa_chiTiet;

    @Column(name = "sp_ngaycapnhat")
    private LocalDate sp_ngayCapNhat;

    @Column(name = "sp_soluong")
    private int sp_soLuong;

    @Column(name = "sp_image")
    private String sp_image;

    @ManyToOne
    @JoinColumn(name = "dmc_ma")
    private DanhMucCon dmc_ma;

    @ManyToOne
    @JoinColumn(name = "km_ma")
    private KhuyenMai km_ma;

    @ManyToOne
    @JoinColumn(name = "lsp_ma")
    private LoaiSanPham lsp_ma;

    @ManyToOne
    @JoinColumn(name = "gh_ma")
    private GioHang gh_ma;

    @ManyToOne
    @JoinColumn(name = "ch_ma")
    private CuaHang ch_ma;
}
