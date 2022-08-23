package com.gym.project.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Code extends BaseEntity{

    @Id
    private String codeId;

    private String codeName;

    private String codeCalss;

    private String codeGroup;

    private String codeValue;

    private String description;

    private Boolean isUsable;

    private String creator;

    private String modifier;
}
