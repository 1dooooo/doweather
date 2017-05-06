package com.doweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by do on 2017/5/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }

}
