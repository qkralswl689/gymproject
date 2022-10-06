package com.gym.project.user.entity;

import com.gym.project.board.entity.BoardEntity;
import com.gym.project.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class UserEntity extends BaseEntity{

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "userindex")
    private int userIndex;

    @Id
    @Column(name = "useremail")
    private String userEmail;

    @Column(name = "userpw")
    private String userPw;

    @Column(name = "username")
    private String userName;

    @Column(name = "gymname")
    private String gymName;

    @Column(name = "socialyn")
    private boolean socialYN;

    @Column(name = "userclass")
    private String userClass;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "userbirth")
    private Date userBirth;

    @OneToMany(mappedBy = "user")
    private List<BoardEntity> boards = new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<UserRole> userRoleSet;

    public void addUserRole(UserRole userRole){
        userRoleSet.add(userRole);
    }





}
