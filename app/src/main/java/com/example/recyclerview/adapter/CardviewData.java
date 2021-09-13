package com.example.recyclerview.adapter;

public class CardviewData {
    String details;
    int photo;

    public CardviewData(String details, int photo) {
        this.details = details;
        this.photo = photo;
    }

    public String getDetails() {
        return details;
    }

    public int getPhoto() {
        return photo;
    }
}
