package com.example.finalproject;

import android.os.Parcel;
import android.os.Parcelable;

public class ListName implements Parcelable {


    private String name;
    private String login;

    private String full_name;

    private Owner owner;

    public ListName(String name, String login, String full_name, Owner owner) {
        this.name = name;
        this.login = login;
        this.full_name = full_name;
        this.owner = owner;
    }

    protected ListName(Parcel in) {
        name = in.readString();
        login = in.readString();
        full_name = in.readString();
    }

    public static final Creator<ListName> CREATOR = new Creator<ListName>() {
        @Override
        public ListName createFromParcel(Parcel in) {
            return new ListName(in);
        }

        @Override
        public ListName[] newArray(int size) {
            return new ListName[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(login);
        dest.writeString(full_name);
    }
}

