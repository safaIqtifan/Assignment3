package com.example.assignment3.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MyEmailModel implements Parcelable {

    int id;
    String letter;
    String name;

    public MyEmailModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected MyEmailModel(Parcel in) {
        id = in.readInt();
        letter = in.readString();
        name = in.readString();
    }

    public static final Creator<MyEmailModel> CREATOR = new Creator<MyEmailModel>() {
        @Override
        public MyEmailModel createFromParcel(Parcel in) {
            return new MyEmailModel(in);
        }

        @Override
        public MyEmailModel[] newArray(int size) {
            return new MyEmailModel[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(letter);
        dest.writeString(name);
    }

    @Override
    public String toString() {
        return  "Name = " + letter + "\n" +"\n" +
                " Name = " + name;
    }

}
