package com.hank

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
//            "http://atm201605.appspot.com/h"
//            "https://api.jsonserve.com/pQ-Nim"
//            "https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0381e141-f7ee-450e-99da-2240208d1773"
    val url =
        URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0381e141-f7ee-450e-99da-2240208d1773");
    println(url.readText())
//    with(url.openConnection() as HttpURLConnection) {
//        val br = inputStream.bufferedReader().lines().forEach {
//            println(it)
//        }
//
//    }


}