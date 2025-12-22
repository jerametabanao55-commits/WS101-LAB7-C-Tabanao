package com.tabanao.Lab_7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    private Long id;
    private Long name;
    private Long price;

    public void setPrice() {
        setPrice((Long) null);
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setPrice(Double price) {

    }

    public void setName() {

    }
}