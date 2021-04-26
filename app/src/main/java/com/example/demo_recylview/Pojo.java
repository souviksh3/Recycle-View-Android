package com.example.demo_recylview;

public class Pojo {
    String date,team1,team2,time;

    public Pojo(String date, String team1, String team2, String time)
    {
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
