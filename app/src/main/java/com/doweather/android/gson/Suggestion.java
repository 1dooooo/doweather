package com.doweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by do on 2017/5/6.
 */

public class Suggestion {

    @SerializedName("comf")
    public  Comfort comfort;

    @SerializedName("drsg")
    public DressCloth dresscloth;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class DressCloth{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
