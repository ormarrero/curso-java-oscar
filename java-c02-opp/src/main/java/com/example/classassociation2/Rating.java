package com.example.classassociation2;

public class Rating {

    private Double score;   // 1 - 5
    private String comment;  // frase o párrafo
    // TODO se puede agregar un usuario:

    public Rating() {
    }

    public Rating(Double score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
