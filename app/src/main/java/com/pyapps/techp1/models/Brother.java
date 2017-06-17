package com.pyapps.techp1.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by prudh on 6/14/2017.
 */

public class Brother implements Parcelable{
    int id;
    String  name;
    String department;
    String funfact;
    String description;
    String picture;
    String whyJoin;

    public Brother()
    {}

    public static Creator<Brother> getCREATOR() {
        return CREATOR;
    }
    protected Brother(Parcel in) {
        id = in.readInt();
        name = in.readString();
        department = in.readString();
        funfact = in.readString();
        description = in.readString();
        picture = in.readString();
        whyJoin = in.readString();
    }

    public static final Creator<Brother> CREATOR = new Creator<Brother>() {
        @Override
        public Brother createFromParcel(Parcel in) {
            return new Brother(in);
        }

        @Override
        public Brother[] newArray(int size) {
            return new Brother[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(department);
        dest.writeString(funfact);
        dest.writeString(description);
        dest.writeString(picture);
        dest.writeString(whyJoin);
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

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

    public String getFunfact() {
        return funfact;
    }

    public void setFunfact(String funfact) {
        this.funfact = funfact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getWhyJoin() {
        return whyJoin;
    }

    public void setWhyJoin(String whyJoin) {
        this.whyJoin = whyJoin;
    }

}
