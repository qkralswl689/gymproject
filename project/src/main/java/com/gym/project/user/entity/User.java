package com.gym.project.user.entity;

import com.gym.project.entity.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class User extends BaseEntity{

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int userIndex;

    @Id
    private String userEmail;

    private String userPw;

    private String userName;

    private String gymName;

    private String userRole;

    private String socialYN;

    private String userClass;

    private String phoneNumber;

    private LocalDateTime userBirth;



}
