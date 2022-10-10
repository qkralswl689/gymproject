package com.gym.project.membership.entity;

import com.gym.project.gyminfo.entity.GymEntity;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class MemberEntity {

    @Id
    @GeneratedValue
    @Column(name = "memberid")
    private Long memberid;

    @OneToMany(mappedBy = "member")
    private List<GymEntity> gym = new ArrayList<>();

    private String belt;

    private Long attendancecount;

    private LocalDateTime regdate;

    private Date expiredate;
}
