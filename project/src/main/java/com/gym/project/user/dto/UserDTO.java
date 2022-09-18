package com.gym.project.user.dto;

import com.gym.project.board.entity.BoardEntity;
import com.gym.project.user.entity.UserEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDTO {

    private int userIndex;
    private String userEmail;
    private String userPw;
    private String userName;
    private String gymName;
    private boolean socialYN;
    private String userClass;
    private String phoneNumber;
    private Date userBirth;

    public UserEntity toEntity(){
        UserEntity build = UserEntity.builder()
                .userEmail(userEmail)
                .userPw(userPw)
                .userName(userName)
                .gymName(gymName)
                .socialYN(socialYN)
                .userClass(userClass)
                .phoneNumber(phoneNumber)
                .userBirth(userBirth)
                .build();
        return build;

    }

    @Builder
    public UserDTO( int userIndex,String userEmail,String userPw,String userName,String gymName,boolean socialYN,String userClass,String phoneNumber,Date userBirth){
        this.userIndex = userIndex;
        this.userEmail = userEmail;
        this.userPw = userPw;
        this.userName = userName;
        this.gymName = gymName;
        this.socialYN = socialYN;
        this.userClass = userClass;
        this.phoneNumber = phoneNumber;
        this.userBirth = userBirth;

    }
}
