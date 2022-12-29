package com.fread.freadbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity( name = "courses_details")
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer courseid;
    private String coursecode;
    private String coursename;
    private String author;
    private String descrp;
    private String rating;
    private String tags;
    private String test;
    private String chapters;
    private String videos;
    private String image;
    private Integer enrolls;
    private String posted_on;
    private String updated_on;
    private String dateovr;
    private String datefrm;
    private String nbh;

    public Course() {
    }

    public Course(Integer courseid, String coursecode, String coursename, String author, String descrp, String rating, String tags, String test, String chapters, String videos, String image, Integer enrolls, String posted_on, String updated_on,String dateovr,String datefrm,String nbh) {
        this.courseid = courseid;
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.author = author;
        this.descrp = descrp;
        this.rating = rating;
        this.tags = tags;
        this.test = test;
        this.chapters = chapters;
        this.videos = videos;
        this.image = image;
        this.enrolls = enrolls;
        this.posted_on = posted_on;
        this.updated_on = updated_on;
        this.dateovr = dateovr;
        this.datefrm = datefrm;
        this.nbh = nbh;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String course_code) {
        this.coursecode = course_code;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String course_name) {
        this.coursename = course_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescrp() {
        return descrp;
    }

    public void setDescrp(String descrp) {
        this.descrp = descrp;
    }


    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getEnrolls() {
        return enrolls;
    }

    public void setEnrolls(Integer enrolls) {
        this.enrolls = enrolls;
    }

    public String getPosted_on() {
        return posted_on;
    }

    public void setPosted_on(String posted_on) {
        this.posted_on = posted_on;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

	public String getDateovr() {
		return dateovr;
	}

	public void setDateovr(String dateovr) {
		this.dateovr = dateovr;
	}

	public String getDatefrm() {
		return datefrm;
	}

	public void setDatefrm(String datefrm) {
		this.datefrm = datefrm;
	}

	public String getNbh() {
		return nbh;
	}

	public void setNbh(String nbh) {
		this.nbh = nbh;
	}
    
}
