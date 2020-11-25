package com.czetsuyatech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@RestController
public class CatalogController {

    @GetMapping("/tenant/branch2/catalog")
    public String listCatalogBranch2() {
        return "Catalog2";
    }

    @GetMapping("/tenant/branch1/catalog")
    public String listCatalogBranch1() {
        return "Catalog1";
    }
}
