package com.practice.web.soccer;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamNo;
    @Column(length = 200)
    private String teamId;
    @Column(length = 200)
    private String regionnName;
    @Column(length = 200)
    private String teamName;
    @Column(length = 200)
    private String eTeamName;
    @Column(length = 200)
    private String origYyyy;
    @Column(length = 200)
    private String zipCode1;
    @Column(length = 200)
    private String zipCode2;
    @Column(length = 200)
    private String address;
    @Column(length = 200)
    private String ddd;
    @Column(length = 200)
    private String tel;
    @Column(length = 200)
    private String homepage;
    @Column(length = 200)
    private String owner;
    @Builder
    public Team(
            String teamId,
             String regionName,
             String teamName,
             String eTeamName,
             String origyyyy,
             String zipCode1,
             String zipCode2,
             String address,
             String ddd,
             String tel,
             String homepage,
             String owner
    ){
        this.teamId=teamId;
        this.regionnName=regionName;
        this.teamName=teamName;
        this.eTeamName=eTeamName;
        this.origYyyy=origyyyy;
        this.zipCode1=zipCode1;
        this.zipCode2=zipCode2;
        this.address=address;
        this.ddd=ddd;
        this.tel=tel;
        this.homepage=homepage;
        this.owner=owner;

    }
}
