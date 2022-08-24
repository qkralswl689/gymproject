package com.gym.project.user.entity;

import com.gym.project.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class UserEntity extends BaseEntity{

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int userIndex;

    @Id
    private String userEmail;

    private String userPw;

    private String userName;

    private String gymName;

    private String socialYN;

    private String userClass;

    private String phoneNumber;

    private Date userBirth;


    @ElementCollection(fetch = FetchType.LAZY)
    private Set<UserRole> userRoleSet;

    public void addUserRole(UserRole userRole){
        userRoleSet.add(userRole);
    }





}
