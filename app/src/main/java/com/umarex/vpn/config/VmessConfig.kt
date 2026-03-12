// VmessConfig.kt

package com.umarex.vpn.config

import com.google.gson.Gson
import com.google.gson.JsonObject

class VmessConfig {
    var v: String = ""
    var ps: String = ""
    var add: String = ""
    var port: String = ""
    var id: String = ""
    var aid: String = ""
    var net: String = ""
    var type: String = ""
    var host: String = ""
    var path: String = ""
    var tls: String = ""

    fun parse(jsonData: String): VmessConfig {
        val jsonObject = Gson().fromJson(jsonData, JsonObject::class.java)
        this.v = jsonObject.get("v").asString
        this.ps = jsonObject.get("ps").asString
        this.add = jsonObject.get("add").asString
        this.port = jsonObject.get("port").asString
        this.id = jsonObject.get("id").asString
        this.aid = jsonObject.get("aid").asString
        this.net = jsonObject.get("net").asString
        this.type = jsonObject.get("type").asString
        this.host = jsonObject.get("host").asString
        this.path = jsonObject.get("path").asString
        this.tls = jsonObject.get("tls").asString
        return this
    }
}