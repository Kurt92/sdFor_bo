package com.jt.sdfor.framework.support.menu.controller;

import com.jt.sdfor.framework.core.response.IRestResponse;
import com.jt.sdfor.framework.core.response.RestResponse;
import com.jt.sdfor.framework.support.menu.service.MenuMngService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MenuMngContorller {

    private final MenuMngService menuMngService;

    @GetMapping("/api/ll/menu/tree")
    public ResponseEntity<? extends IRestResponse> findAll() {

        return RestResponse.of(menuMngService.findAll());
    }
}
