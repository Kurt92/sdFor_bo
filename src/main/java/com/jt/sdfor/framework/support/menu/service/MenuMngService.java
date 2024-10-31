package com.jt.sdfor.framework.support.menu.service;

import com.jt.sdfor.framework.support.menu.domain.MenuMng;
import com.jt.sdfor.framework.support.menu.domain.MenuMngRepository;
import com.jt.sdfor.framework.support.menu.dto.MenuTreeDTO;
import com.jt.sdfor.framework.support.menu.repository.MenuQueryDslRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuMngService {

    private final MenuMngRepository menuMngRepository;
    private final MenuQueryDslRepository menuQueryDslRepository;

    //JPARepository
//    @Transactional
//    public List<MenuTreeDTO> findAll() {
//
//        List<MenuMng> menuList = menuMngRepository.findByParentIsNull();
//
//        return menuList.stream()
//                .map(MenuTreeDTO::new)
//                .collect(Collectors.toList());
//    }

    //QueryDSL
    @Transactional
    public List<MenuTreeDTO> findAll() {
        return menuQueryDslRepository.findAll();
    }

}
