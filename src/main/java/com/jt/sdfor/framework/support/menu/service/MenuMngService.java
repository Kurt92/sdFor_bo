package com.jt.sdfor.framework.support.menu.service;

import com.jt.sdfor.framework.support.menu.domain.MenuMng;
import com.jt.sdfor.framework.support.menu.domain.MenuMngRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuMngService {

    private final MenuMngRepository menuMngRepository;

    @Transactional
    public List<MenuMng> findAll() {
        return menuMngRepository.findAll();
    }

}
