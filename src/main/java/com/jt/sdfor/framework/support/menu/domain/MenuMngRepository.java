package com.jt.sdfor.framework.support.menu.domain;

import com.jt.sdfor.framework.support.menu.dto.MenuTreeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MenuMngRepository extends JpaRepository<MenuMng, String> {

    List<MenuMng> findByParentIsNullOrderByListOrderAsc();

}
