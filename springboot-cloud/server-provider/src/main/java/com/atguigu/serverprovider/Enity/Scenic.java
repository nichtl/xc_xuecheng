package com.atguigu.serverprovider.Enity;

public class Scenic {
 private  String Scenic_Name;
 private  String Scenic_Introduce;
 private  String Scenic_Tip;
 private  String Scenic_Open_Hour;
 private  String Scenic_Star;
 private  String Scenic_Address;
 private  String Message_Source_City;

    @Override
    public String toString() {
        return "Scenic{" +
                "Scenic_Name='" + Scenic_Name + '\'' +
                ", Scenic_Introduce='" + Scenic_Introduce + '\'' +
                ", Scenic_Tip='" + Scenic_Tip + '\'' +
                ", Scenic_Open_Hour='" + Scenic_Open_Hour + '\'' +
                ", Scenic_Star='" + Scenic_Star + '\'' +
                ", Scenic_Address='" + Scenic_Address + '\'' +
                ", Message_Source_City='" + Message_Source_City + '\'' +
                '}';
    }

    public String getScenic_Name() {
        return Scenic_Name;
    }

    public void setScenic_Name(String scenic_Name) {
        Scenic_Name = scenic_Name;
    }

    public String getScenic_Introduce() {
        return Scenic_Introduce;
    }

    public void setScenic_Introduce(String scenic_Introduce) {
        Scenic_Introduce = scenic_Introduce;
    }

    public String getScenic_Tip() {
        return Scenic_Tip;
    }

    public void setScenic_Tip(String scenic_Tip) {
        Scenic_Tip = scenic_Tip;
    }

    public String getScenic_Open_Hour() {
        return Scenic_Open_Hour;
    }

    public void setScenic_Open_Hour(String scenic_Open_Hour) {
        Scenic_Open_Hour = scenic_Open_Hour;
    }

    public String getScenic_Star() {
        return Scenic_Star;
    }

    public void setScenic_Star(String scenic_Star) {
        Scenic_Star = scenic_Star;
    }

    public String getScenic_Address() {
        return Scenic_Address;
    }

    public void setScenic_Address(String scenic_Address) {
        Scenic_Address = scenic_Address;
    }

    public String getMessage_Source_City() {
        return Message_Source_City;
    }

    public void setMessage_Source_City(String message_Source_City) {
        Message_Source_City = message_Source_City;
    }
}
