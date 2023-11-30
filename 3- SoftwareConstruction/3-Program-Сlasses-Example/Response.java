package com.gleb.lab9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String date;

    private String responseText;

    public Response() {
    }

    public Response(String date, String responseText) {
        this.date = date;
        this.responseText = responseText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", responseText='" + responseText + '\'' +
                '}';
    }
}
