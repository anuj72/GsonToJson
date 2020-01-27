package com.trackme.gsontojson

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.trackme.gsontojson.model.api1data.onlineUserLiveDTO


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var jsonValue="{\n" +
                "    \"statusResponse\": {\n" +
                "        \"status\": \"SUCCESS\",\n" +
                "        \"userType\": null,\n" +
                "        \"statusCode\": \"1\",\n" +
                "        \"message\": null\n" +
                "    },\n" +
                "    \"onlineUserLiveDTO\": [\n" +
                "        {\n" +
                "            \"userName\": \"INTERNATIONAL  SCHOOLING\",\n" +
                "            \"userStandard\": \"\",\n" +
                "            \"userRole\": \"ROLE_SCHOOL_ADMIN\",\n" +
                "            \"activeUser\": 1,\n" +
                "            \"userEmail\": \"nishanwac@gmail.com\",\n" +
                "            \"loginTime\": \"January 27, 2020, 11:59 AM\"\n" +
                "        }\n" +
                "    ]\n" +
                "}"
        val gson = Gson()
        val dashboardResponse: onlineUserLiveDTO =
            gson.fromJson(jsonValue, onlineUserLiveDTO::class.java)
        Log.v("sssss", dashboardResponse.onlineUserLiveDTO!!.size.toString())
        for(i in 0 until dashboardResponse.onlineUserLiveDTO!!.size )
        {
            Log.v("kkkk",dashboardResponse.onlineUserLiveDTO.get(i)!!.userEmail)
        }
    }
}
