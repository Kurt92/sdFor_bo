package com.jt.sdfor.framework.support.menu.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Table(name = "ll_menu_mng")
public class MenuMng {

    @Id
    @Comment("메뉴ID")
    @Column(name = "menu_id", length = 10)
    private String menuId;
    //    @Comment("상위메뉴ID")
//    @Column(name = "p_menu_id", length = 10, nullable = false)
//    private String pMenuId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "p_menu_id")
    private MenuMng parent;
    @Comment("메뉴명")
    @Column(name = "menu_nm", length = 50, nullable = false)
    private String menuNm;
    @Comment("메뉴명 다국어 메시지코드")
    @Column(name = "locale_message_cd", length = 50, nullable = false)
    private String localeMessageCd;
    @Comment("메뉴 설명")
    @Column(name = "menu_dc")
    private String menuDc;
    @Comment("리스트 정렬 순서")
    @Column(name = "list_order")
    private Integer listOrder;
}
