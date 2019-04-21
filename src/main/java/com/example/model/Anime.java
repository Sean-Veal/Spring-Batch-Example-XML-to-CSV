package com.example.model;

import com.example.adapter.JaxbDateAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlRootElement(name = "anime")
public class Anime {
    private int animeId;
    private String animeTitle;
    private String seriesType;
    private int episodes;
    private int myId;
    private int myWatchedEpisodes;
    private Date myStartDate;
    private Date myFinishedDate;
    private Object myRated;
    private int myScore;
    private Object myDvd;
    private Object myStorage;
    private String myStatus;
    private String myComments;
    private int myTimesWatched;
    private int myRewatchValue;
    private Object myTags;
    private int myRewatching;
    private int myRewatchingEp;
    private int updateOnImport;

    @XmlElement(name = "series_animedb_id")
    public int getAnimeId() {
        return animeId;
    }

    public void setAnimeId(int animeId) {
        this.animeId = animeId;
    }

    @XmlElement(name = "series_title")
    public String getAnimeTitle() {
        return animeTitle;
    }

    public void setAnimeTitle(String animeTitle) {
        this.animeTitle = animeTitle;
    }

    @XmlElement(name = "series_type")
    public String getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(String seriesType) {
        this.seriesType = seriesType;
    }

    @XmlElement(name = "series_episodes")
    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @XmlElement(name = "my_id")
    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    @XmlElement(name = "my_watched_episodes")
    public int getMyWatchedEpisodes() {
        return myWatchedEpisodes;
    }

    public void setMyWatchedEpisodes(int myWatchedEpisodes) {
        this.myWatchedEpisodes = myWatchedEpisodes;
    }

    @XmlJavaTypeAdapter(JaxbDateAdapter.class)
    @XmlElement(name = "my_start_date")
    public Date getMyStartDate() {
        return myStartDate;
    }

    public void setMyStartDate(Date myStartDate) {
        this.myStartDate = myStartDate;
    }

    @XmlJavaTypeAdapter(JaxbDateAdapter.class)
    @XmlElement(name = "my_finish_date")
    public Date getMyFinishedDate() {
        return myFinishedDate;
    }

    public void setMyFinishedDate(Date myFinishedDate) {
        this.myFinishedDate = myFinishedDate;
    }

    @XmlElement(name = "my_rated")
    public Object getMyRated() {
        return myRated;
    }

    public void setMyRated(Object myRated) {
        this.myRated = myRated;
    }

    @XmlElement(name = "my_score")
    public int getMyScore() {
        return myScore;
    }

    public void setMyScore(int myScore) {
        this.myScore = myScore;
    }

    @XmlElement(name = "my_dvd")
    public Object getMyDvd() {
        return myDvd;
    }

    public void setMyDvd(Object myDvd) {
        this.myDvd = myDvd;
    }

    @XmlElement(name = "my_storage")
    public Object getMyStorage() {
        return myStorage;
    }

    public void setMyStorage(Object myStorage) {
        this.myStorage = myStorage;
    }

    @XmlElement(name = "my_status")
    public String getMyStatus() {
        return myStatus;
    }

    public void setMyStatus(String myStatus) {
        this.myStatus = myStatus;
    }

    @XmlElement(name = "my_comments")
    public String getMyComments() {
        return myComments;
    }

    public void setMyComments(String myComments) {
        this.myComments = myComments;
    }

    @XmlElement(name = "my_times_watched")
    public int getMyTimesWatched() {
        return myTimesWatched;
    }

    public void setMyTimesWatched(int myTimesWatched) {
        this.myTimesWatched = myTimesWatched;
    }

    @XmlElement(name = "my_rewatch_value")
    public int getMyRewatchValue() {
        return myRewatchValue;
    }

    public void setMyRewatchValue(int myRewatchValue) {
        this.myRewatchValue = myRewatchValue;
    }

    @XmlElement(name = "my_tags")
    public Object getMyTags() {
        return myTags;
    }

    public void setMyTags(Object myTags) {
        this.myTags = myTags;
    }

    @XmlElement(name = "my_rewatching")
    public int getMyRewatching() {
        return myRewatching;
    }

    public void setMyRewatching(int myRewatching) {
        this.myRewatching = myRewatching;
    }

    @XmlElement(name = "my_rewatching_ep")
    public int getMyRewatchingEp() {
        return myRewatchingEp;
    }

    public void setMyRewatchingEp(int myRewatchingEp) {
        this.myRewatchingEp = myRewatchingEp;
    }

    @XmlElement(name = "update_on_import")
    public int getUpdateOnImport() {
        return updateOnImport;
    }

    public void setUpdateOnImport(int updateOnImport) {
        this.updateOnImport = updateOnImport;
    }
}
