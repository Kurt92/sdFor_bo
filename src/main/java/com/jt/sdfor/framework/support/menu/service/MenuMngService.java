package com.jt.sdfor.framework.support.menu.service;

import com.jt.sdfor.framework.support.menu.domain.MenuMngRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MenuMngService {

    private final MenuMngRepository menuMngRepository;

    public void findAll() {
        menuMngRepository.findAll();

    }

}
