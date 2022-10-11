package com.gym.project.gyminfo.entity;


import com.gym.project.membership.entity.MemberEntity;
import com.gym.project.user.entity.UserEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="gym")
public class GymEntity {

    @Id
    @GeneratedValue
    private Long gymid;

    private String gymname;

    private String adress;

    private String master;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "memberid")
    private List<MemberEntity> member = new ArrayList<>();

    @OneToMany(mappedBy = "gym")
    private List<UserEntity> user = new ArrayList<>();



}
