package com.sale_clothes.nhom11.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "danh_muc")
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dm_ma")
    private Integer dmMa;

    @Column(name = "dm_ten")
    private String dmTen;

    @Column(name = "dm_type")
    private String dmType;
}
