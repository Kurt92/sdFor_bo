package com.jt.sdfor.framework.support.menu.service;

import com.jt.sdfor.framework.support.menu.domain.MenuMng;
import com.jt.sdfor.framework.support.menu.domain.MenuMngRepository;
import com.jt.sdfor.framework.support.menu.dto.MenuTreeDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuMngService {

    private final MenuMngRepository menuMngRepository;

    @Transactional
    public List<MenuTreeDTO> findAll() {

        List<MenuMng> menuList = menuMngRepository.findAll();

        return menuList.stream()
                .map(MenuTreeDTO::new)
                .collect(Collectors.toList());
    }

}
