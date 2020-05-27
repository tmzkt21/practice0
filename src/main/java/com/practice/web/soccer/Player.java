package com.practice.web.soccer;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long PlayerNo;
    @Column(length = 200)
    private String playerId;
    @Column(length = 200)
    private String playerName;
    @Column(length = 200)
    private  String ePlayerName;
    @Column(length = 200)
    private  String nickname;
    @Column(length = 200)
    private  String joinYyyy;
    @Column(length = 200)
    private  String position;
    @Column(length = 200)
    private  String BackNo;
    @Column(length = 200)
    private  String nation;
    @Column(length = 200)
    private  String birthDate;
    @Column(length = 200)
    private  String solar;
    @Column(length = 200)
    private  String height;
    @Column(length = 200)
    private  String weight;
    public Player(String playerId,
            String playerName,
              String ePlayerName,
              String nickname,
              String joinYyyy,
              String position,
              String BackNo,
              String nation,
              String birthDate,
              String solar,
              String height,
                  String weight){
        this.playerId = playerId;
        this.playerName = playerName;
        this.ePlayerName = ePlayerName;
        this.nickname = nickname;
        this.joinYyyy =joinYyyy;
        this.position = position;
        this.BackNo = BackNo;
        this.nation = nation;
        this.birthDate = birthDate;
        this.solar = solar;
        this.height = height;
        this.weight=weight;
    }
}
