package com.jt.sdfor.framework.support.menu.repository;



import com.jt.sdfor.framework.support.menu.domain.MenuMng;
import com.jt.sdfor.framework.support.menu.domain.QMenuMng;
import com.jt.sdfor.framework.support.menu.dto.MenuTreeDTO;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

import static com.jt.sdfor.framework.support.menu.domain.QMenuMng.menuMng;
import static com.jt.sdfor.framework.support.menu.domain.QProgramMng.programMng;

@Repository
@RequiredArgsConstructor
public class MenuQueryDslRepository {

    private final JPAQueryFactory queryFactory;

    public List<MenuTreeDTO> findAll() {

        List<MenuMng> menu = queryFactory
                .selectFrom(menuMng)
                .leftJoin(menuMng.child).fetchJoin()
                .where(menuMng.parent.isNull())
                .fetch();

        return menu.stream()
                .map(MenuTreeDTO::new)
                .collect(Collectors.toList());
    }

}
