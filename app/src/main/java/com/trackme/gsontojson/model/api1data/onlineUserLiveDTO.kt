package com.trackme.gsontojson.model.api1data


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class onlineUserLiveDTO(
    @SerializedName("onlineUserLiveDTO")
    val onlineUserLiveDTO: List<OnlineUserLiveDTO?>?,
    @SerializedName("statusResponse")
    val statusResponse: StatusResponse?
) {
    @Keep
    data class OnlineUserLiveDTO(
        @SerializedName("activeUser")
        val activeUser: Int?,
        @SerializedName("loginTime")
        val loginTime: String?,
        @SerializedName("userEmail")
        val userEmail: String?,
        @SerializedName("userName")
        val userName: String?,
        @SerializedName("userRole")
        val userRole: String?,
        @SerializedName("userStandard")
        val userStandard: String?
    )

    @Keep
    data class StatusResponse(
        @SerializedName("message")
        val message: Any?,
        @SerializedName("status")
        val status: String?,
        @SerializedName("statusCode")
        val statusCode: String?,
        @SerializedName("userType")
        val userType: Any?
    )
}