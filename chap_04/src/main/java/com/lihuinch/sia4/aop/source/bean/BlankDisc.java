package com.lihuinch.sia4.aop.source.bean;

import java.util.List;

public class BlankDisc /* implements CompactDisc todo !!! 这边加上一个接口实现就不行了 因为这里的aop使用动态代理实现的 ？*/ {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc() {
    }

    /**
     * 播放地几首曲子
     *
     * @param no 1开始
     */
    public void play(int no) {
        System.out.println("Playing " + title + " by " + artist);
        if (tracks.size() < no - 1) {
            System.out.println("磁道范围只有 " + tracks.size());
            throw new RuntimeException("磁道范围只有 " + tracks.size());
        }

        System.out.println("-Track: " + tracks.get(no - 1));

    }

    public String getTitle() {
        return title;
    }

    public BlankDisc setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public BlankDisc setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public BlankDisc setTracks(List<String> tracks) {
        this.tracks = tracks;
        return this;
    }
}
