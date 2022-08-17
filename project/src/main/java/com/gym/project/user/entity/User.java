package com.gym.project.user.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class User {

    @Id
    private String userId;

    private String userEmail;

    private String userPw;

    private String userName;

    private LocalDateTime userBirth;

    private String belt;

    private int attendanceCount;

    private String gymName;

}
