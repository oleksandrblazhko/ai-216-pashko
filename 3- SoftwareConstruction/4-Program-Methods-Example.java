package com.gleb.lab9.model;

import jakarta.persistence.*;

@Entity
public class RequestFood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String adviceText;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "response_id")
    private Response response;


    public String RequestForFood(String productName, String age, String userHeight, String userWeight) {
        String result = "";

        if (productName.isBlank() && (age.length() <= 12)) {
            result = "-1 - productName does not meet the conditions";

        } if (!(age.length() <= 12) || age.isBlank() ) {
            result = "-2 - age does not meet the condition";

        } else if (userHeight.isBlank()) {
            result = "-3 - userHeight does not meet the condition";

        } else if (userWeight.isBlank()) {
            result = "-4 - userWeight does not meet the condition";

        } else {
            result = "1 - The user has successfully entered data";
        }

        return result;
    }


    public RequestFood() {
    }

    public RequestFood(String adviceText, User user, Response response) {
        this.adviceText = adviceText;
        this.user = user;
        this.response = response;
    }

    @Override
    public String toString() {
        return "RequestFood{" +
                "id=" + id +
                ", adviceText='" + adviceText + '\'' +
                ", user=" + user +
                ", response=" + response +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdviceText() {
        return adviceText;
    }

    public void setAdviceText(String adviceText) {
        this.adviceText = adviceText;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
