package com.star.intentbestpractice;


import android.os.Parcel;
import android.os.Parcelable;

public class ParcelablePerson implements Parcelable {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }

    public static final Parcelable.Creator<ParcelablePerson> CREATOR =
            new Creator<ParcelablePerson>() {
                @Override
                public ParcelablePerson createFromParcel(Parcel source) {

                    ParcelablePerson parcelablePerson = new ParcelablePerson();
                    parcelablePerson.name = source.readString();
                    parcelablePerson.age = source.readInt();

                    return parcelablePerson;
                }

                @Override
                public ParcelablePerson[] newArray(int size) {
                    return new ParcelablePerson[size];
                }
            };
}
