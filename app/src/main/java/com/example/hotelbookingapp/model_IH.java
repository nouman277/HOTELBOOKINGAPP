package com.example.hotelbookingapp;

public class model_IH {



    int IslamabadHotelImage;

    public int getIslamabadHotelImage() {
        return IslamabadHotelImage;
    }

    public void setIslamabadHotelImage(int islamabadHotelImage) {
        IslamabadHotelImage = islamabadHotelImage;
    }

    public String getIslamabadHotelName() {
        return islamabadHotelName;
    }

    public void setIslamabadHotelName(String islamabadHotelName) {
        this.islamabadHotelName = islamabadHotelName;
    }

    public String getRoomUnavialRed() {
        return roomUnavialRed;
    }

    public void setRoomUnavialRed(String roomUnavialRed) {
        this.roomUnavialRed = roomUnavialRed;
    }

    public String getRoomAvaliGreen() {
        return roomAvaliGreen;
    }

    public void setRoomAvaliGreen(String roomAvaliGreen) {
        this.roomAvaliGreen = roomAvaliGreen;
    }

    public model_IH(int islamabadHotelImage, String islamabadHotelName, String roomUnavialRed, String roomAvaliGreen) {
        IslamabadHotelImage = islamabadHotelImage;
        this.islamabadHotelName = islamabadHotelName;
        this.roomUnavialRed = roomUnavialRed;
        this.roomAvaliGreen = roomAvaliGreen;
    }

    String islamabadHotelName, roomUnavialRed,roomAvaliGreen;

}
