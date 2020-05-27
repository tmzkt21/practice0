package com.practice.web.soccer;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheNo;
    @Column(length = 200)
    private String scheDate;
    @Column(length = 200)
    private String gubun;
    @Column(length = 200)
    private String hometeamId;
    @Column(length = 200)
    private  String awayteamId;
    @Column(length = 200)
    private String homeScore;
    @Column(length = 200)
    private String awayScore;

    @Builder
    public Schedule(
            String scheDate,
             String gubun,
             String hometeamId,
              String awayteamId,
             String homeScore,
             String awayScore){
        this.scheDate=scheDate;
        this.gubun=gubun;
        this.hometeamId=hometeamId;
        this.awayteamId=awayteamId;
        this.homeScore=homeScore;
        this.awayScore=awayScore;
    }
}
