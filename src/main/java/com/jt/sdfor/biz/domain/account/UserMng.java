//package com.jt.sdfor.biz.domain.account;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import org.hibernate.annotations.Comment;
//
//@Getter
//@Entity
//@Table(name = "user_mng",
//        uniqueConstraints = {
//            @UniqueConstraint(columnNames = {"accountId"}),
//            @UniqueConstraint(columnNames = {"email"})
//        }
//)
//public class UserMng {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
//    @Comment("유저 PK")
//    private Long userId;
//
//    @Column(name = "account_id")
//    @Comment("계정 ID")
//    private String accountId;
//
//    @Column(name = "account_pass")
//    @Comment("계정 비밀번호")
//    private String accountPass;
//
//    @Column(name = "user_nm")
//    @Comment("유저 이름")
//    private String userNm;
//
//    @Column(name = "email")
//    @Comment("이메일")
//    private String email;
//
//}
